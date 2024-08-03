package org.tesseractrealm.threejsfacade
package three.loaders

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** A simple caching system, used internally by [[FileLoader]].
  *
  *     */
@js.native
@JSImport("three", "Cache")
object Cache extends js.Object:
  /** Whether caching is enabled. Default is false.
    *
    *       */
  var enabled: Boolean = js.native

  /** An object that holds cached files.
    *
    *       */
  var files: js.Object = js.native

  /** Adds a cache entry with a key to reference the file. If this key already holds a file, it is overwritten.
    *
    *       *
    * @param key
    *   the key to reference the cached file by.
    * @param file
    *   The file to be cached.
    */
  def add(key: String, file: js.Object): Unit = js.native

  /** Get the value of key. If the key does not exist undefined is returned.
    *
    *       *
    * @param key
    *   A string key
    * @return
    *   [[js.Object]]
    */
  def get(key: String): js.Object = js.native

  /** Remove the cached file associated with the key.
    *
    *       *
    * @param key
    *   A string key that references a cached file.
    */
  def remove(key: String): Unit = js.native

  /** Remove all values from the cache.
    *
    *       */
  def clear(): Unit = js.native
