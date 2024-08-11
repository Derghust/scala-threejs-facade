# Three.js Facade for Scala 3 / Scala.js

## Overview

This repository provides a Scala 3 facade for the Three.js library, enabling the use of Three.js in Scala.js projects. 
Three.js is a popular JavaScript 3D library that makes WebGL simpler to use. By providing a Scala facade, 
this project allows developers to leverage the powerful features of Three.js while writing code in Scala.

Scala source contain documentation from [threejs.org](https://threejs.org/docs/index.html) and **could be outdated**.

## Features

- **Comprehensive API Coverage**: Access the full range of Three.js functionalities through Scala classes and objects.
- **Type Safety**: Leverage Scala's strong type system to catch errors at compile-time.
- **Interoperability**: Seamlessly integrate with existing JavaScript code and libraries.
- **Modern Scala**: Built for Scala 3, taking advantage of the latest language features and improvements.
- **Examples and Documentation**: Includes detailed examples and documentation to help you get started quickly.

## Installation

Add the following dependency to your `build.sbt`:

```scala
libraryDependencies += "org.github.tesseractrealm" %%% "threejs-facade" % "0.1.0"
```
  
## Contributing

Contributions are welcome! Please feel free to submit a pull request or 
open an issue if you encounter any problems or have suggestions for improvements.

### Running Tests

To run the tests, use the following command:

```bash
sbt test
```

## License

This project is licensed under the MIT License. See the [LICENSE](/LICENSE) file for more details.

## Acknowledgements

This project is inspired by the official [Three.js](https://threejs.org/) library and other Scala.js facades. Special thanks to the Three.js community and contributors.

## Contact

For any questions or suggestions, please open an issue on GitHub.

---

Happy coding with Scala and Three.js!
