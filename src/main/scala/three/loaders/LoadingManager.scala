package org.tesseractrealm.threejsfacade
package three.loaders

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** ==LoadingManager==
  * Handles and keeps track of loaded and pending data. A default global instance of this class is created and used by
  * loaders if not supplied manually - see [[DefaultLoadingManager]].
  *
  * In general that should be sufficient, however there are times when it can be useful to have separate loaders - for
  * example if you want to show separate loading bars for objects and textures.
  *
  * ==Code Example==
  *
  * This example shows how to use LoadingManager to track the progress of [[OBJLoader]].
  *
  * {{{
  *   TODO
  * }}}
  *
  *     */
@js.native
@JSImport("three", "LoadingManager")
class LoadingManager extends js.Object:
  /** Creates a new LoadingManager.
    *
    *       *
    * @param onLoad
    *   (optional) this function will be called when all loaders are done.
    * @param onProgress
    *   (optional) this function will be called when an item is complete.
    * @param onError
    *   (optional) this function will be called a loader encounters errors.
    */
  def this(
    onLoad: js.Function0[Unit] = js.native,
    onProgress: js.Function3[String, Int, Int, Unit] = js.native,
    onError: js.Function1[String, Unit] = js.native
  ) = this()

  /** This function will be called when loading starts. The arguments are:
    *   - url — The url of the item just loaded.
    *   - itemsLoaded — the number of items already loaded so far.
    *   - itemsTotal — the total amount of items to be loaded.
    *
    * By default this is undefined.
    *
    *       */
  var onStart: js.Function3[String, Int, Int, Unit] = js.native

  /** This function will be called when all loading is completed.
    *
    * By default this is undefined, unless passed in the constructor.
    *
    *       */
  var onLoad: js.Function0[Unit] = js.native

  /** This function will be called when an item is complete. The arguments are:
    *   - url — The url of the item just loaded.
    *   - itemsLoaded — the number of items already loaded so far.
    *   - itemsTotal — the total amount of items to be loaded.
    *
    * By default this is undefined, unless passed in the constructor.
    *
    *       */
  var onProgress: js.Function3[String, Int, Int, Unit] = js.native

  /** This function will be called when any item errors, with the argument:
    *   - url — The url of the item that errored.
    *
    * By default this is undefined, unless passed in the constructor.
    *
    *       */
  var onError: js.Function1[String, Unit] = js.native

  /** Registers a loader with the given regular expression. Can be used to define what loader should be used in order to
    * load specific files. A typical use case is to overwrite the default loader for textures.
    *
    * {{{
    *   val regex = new js.RegExp("/\.tga$/i")
    *   manager.addHandler( regex, new TGALoader() );
    * }}}
    *
    * @param regex
    *   A regular expression.
    * @param loader
    *   The loader.
    * @return
    *   [[LoadingManager]]
    */
  def addHandler(regex: js.Object, loader: Loader): LoadingManager = js.native

  /** Can be used to retrieve the registered loader for the given file path.
    *
    * @param file
    *   The file path.
    * @return
    *   [[Loader]]
    */
  def getHandler(file: String): Loader = js.native

  /** Removes the loader for the given regular expression.
    *
    * @param regex
    *   A regular expression.
    * @return
    *   [[LoadingManager]]
    */
  def removeHandler(regex: js.Object): LoadingManager = js.native

  /** Given a URL, uses the URL modifier callback (if any) and returns a resolved URL. If no URL modifier is set,
    * returns the original URL.
    *
    * @param url
    *   the url to load
    * @return
    */
  def resolveUrl(url: String): String = js.native

  /** If provided, the callback will be passed each resource URL before a request is sent. The callback may return the
    * original URL, or a new URL to override loading behavior. This behavior can be used to load assets from .ZIP files,
    * drag-and-drop APIs, and Data URIs.
    *
    * Note: The following methods are designed to be called internally by loaders. You shouldn't call them directly.
    *
    * @param callback
    *   URL modifier callback. Called with url argument, and must return resolvedURL.
    * @return
    *   [[LoadingManager]]
    */
  def setURLModifier(callback: js.Function1[String, String]): LoadingManager = js.native

  /** This should be called by any loader using the manager when the loader starts loading an url.
    *
    * @param url
    *   the loaded url
    */
  def itemStart(url: String): Unit = js.native

  /** This should be called by any loader using the manager when the loader ended loading an url.
    *
    * @param url
    *   the loaded url
    */
  def itemEnd(url: String): Unit = js.native

  /** This should be called by any loader using the manager when the loader errors loading an url.
    *
    * @param url
    *   the loaded url
    */
  def itemError(url: String): Unit = js.native
