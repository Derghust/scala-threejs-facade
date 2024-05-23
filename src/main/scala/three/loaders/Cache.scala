package org.tesseractrealm.threejsfacade
package three.loaders

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** A simple caching system, used internally by [[FileLoader]].
  *
  * [[https://threejs.org/docs/#api/en/loaders/Cache Documentation]]
  */
@js.native
@JSImport("three", "Cache")
class Cache extends js.Object:
  /** Whether caching is enabled. Default is false.
    *
    * [[https://threejs.org/docs/index.html#api/en/loaders/Cache.enabled Documentation]]
    */
  var enabled: Boolean = js.native

  /** An object that holds cached files.
    *
    * [[https://threejs.org/docs/index.html#api/en/loaders/Cache.files Documentation]]
    */
  var files: js.Object = js.native

  /** Adds a cache entry with a key to reference the file. If this key already holds a file, it is overwritten.
    *
    * [[https://threejs.org/docs/index.html#api/en/loaders/Cache.add Documentation]]
    *
    * @param key
    *   the key to reference the cached file by.
    * @param file
    *   The file to be cached.
    */
  def add(key: String, file: js.Object): Unit = js.native

  /** Get the value of key. If the key does not exist undefined is returned.
    *
    * [[https://threejs.org/docs/index.html#api/en/loaders/Cache.get Documentation]]
    *
    * @param key
    *   A string key
    * @return
    *   [[js.Object]]
    */
  def get(key: String): js.Object = js.native

  /** Remove the cached file associated with the key.
    *
    * [[https://threejs.org/docs/index.html#api/en/loaders/Cache.remove Documentation]]
    *
    * @param key
    *   A string key that references a cached file.
    */
  def remove(key: String): Unit = js.native

  /** Remove all values from the cache.
    *
    * [[https://threejs.org/docs/index.html#api/en/loaders/Cache.clear Documentation]]
    */
  def clear(): Unit = js.native
