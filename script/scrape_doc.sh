#!/bin/bash

# This is proto script for scraping Three.js Documentation

# Function to display help
display_help() {
    echo "Usage: $0 [options]"
    echo
    echo "This script parses HTML files in a specified directory and generates Scaladoc documentation."
    echo
    echo "Options:"
    echo "  -d, --directory DIR     Specify the directory containing HTML files (default: three.js/docs/api/en/)"
    echo "  -o, --output DIR        Specify the directory to save Scaladoc files (default: ./output)"
    echo "  -h, --help              Display this help message and exit"
    echo "  --debug                 Enable debug logging"
}

# Function to log debug messages
debug_log() {
    if [[ "$DEBUG" == "true" ]]; then
        echo "DEBUG: $1"
    fi
}

# Function to parse HTML file and extract class, constructor, and methods
parse_html() {
    local file_path=$1
    local output_dir=$2
    local file_name=$(basename "$file_path")
    local class_name="${file_name%.html}"
    debug_log "Processing file: $file_path"
    debug_log "Extracted class name from file name: $class_name"

    local class_desc=$(awk '/<p class="desc">/,/<\/p>/' "$file_path" | sed -e 's/<[^>]*>//g' -e 's/^[ \t]*//;s/[ \t]*$//' | tr '\n' ' ' | sed 's/[ \t]+/ /g')
    debug_log "Extracted class description: $class_desc"

    local constructor_signature=$(awk '/<h2>Constructor<\/h2>/,/<\/h3>/' "$file_path" | grep -oP '(?<=<h3>).*(?=</h3>)' | sed -e 's/<[^>]*>//g' | tr '\n' ' ' | sed 's/[ \t]+/ /g')
    debug_log "Extracted constructor signature: $constructor_signature"

    # Extract constructor parameter descriptions
    local constructor_params=$(awk '/<h2>Constructor<\/h2>/,/<\/p>/' "$file_path" | awk '/<p>/,/<\/p>/' | sed -e 's/<br \/>/\n/g' -e 's/<[^>]*>//g' | sed -e 's/^[ \t]*//;s/[ \t]*$//')
    debug_log "Extracted constructor parameters: $constructor_params"

    local methods_section=$(grep -A 1000 '<h2>Methods</h2>' "$file_path")

    mkdir -p "$output_dir"
    local output_file="${output_dir}/${class_name}.scaladoc"

    echo "/**" > "$output_file"
    echo " * $class_desc" >> "$output_file"
    echo " *" >> "$output_file"
    echo " * [[https://threejs.org/docs/index.html#api/en/loaders/managers/LoadingManager Documentation]]" >> "$output_file"
    echo " *" >> "$output_file"
    echo " * @constructor" >> "$output_file"

    # Add parameter descriptions
    while IFS= read -r line; do
        if [[ -n "$line" ]]; then
            local param_name=$(echo "$line" | awk -F ' — ' '{print $1}' | awk -F ': ' '{print $2}')
            local param_desc=$(echo "$line" | awk -F ' — ' '{print $2}')
            echo " * @param $param_name $param_desc" >> "$output_file"
        fi
    done <<< "$constructor_params"

    echo " */" >> "$output_file"

    echo "$methods_section" | grep -oP '<h3>\[method:.*?</p>' | while IFS= read -r line; do
        local method_description=$(echo "$line" | grep -oP '(?<=</h3><p>).*?(?=</p>)')
        debug_log "Extracted method description: $method_description"
        echo "/**" >> "$output_file"
        echo " * @method $class_name $method_description" >> "$output_file"
        echo " */" >> "$output_file"
    done

    debug_log "Written Scaladoc to: $output_file"
}

# Main function to iterate over directory and generate Scaladoc
main() {
    local input_directory=$1
    local output_directory=$2
    local file_count=0
    local generated_count=0

    debug_log "Searching for HTML files in: $input_directory"
    find "$input_directory" -name '*.html' | while IFS= read -r file_path; do
        file_count=$((file_count + 1))
        parse_html "$file_path" "$output_directory"
        local file_name=$(basename "$file_path")
        local class_name="${file_name%.html}"
        echo "Generated Scaladoc for $class_name in $output_directory/$class_name.scaladoc"
        generated_count=$((generated_count + 1))
    done

    echo "Processed $file_count HTML files."
    echo "Generated $generated_count Scaladoc files."
}

# Default directories
docs_directory="three.js/docs/api/en/"
output_directory="./output"
DEBUG="false"

# Parse command-line arguments
while [[ "$1" != "" ]]; do
    case $1 in
        -d | --directory )      shift
                                docs_directory=$1
                                ;;
        -o | --output )         shift
                                output_directory=$1
                                ;;
        -h | --help )           display_help
                                exit
                                ;;
        --debug )               DEBUG="true"
                                ;;
        * )                     display_help
                                exit 1
    esac
    shift
done

main "$docs_directory" "$output_directory"
