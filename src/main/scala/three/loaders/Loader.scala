package org.tesseractrealm.threejsfacade
package three.loaders

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

/** ==Loader==
  *
  * Base class for implementing loaders.
  *
  * [[https://threejs.org/docs/#api/en/loaders/Loader Documentation]]
  */
@js.native
@JSImport("three", "Loader")
class Loader extends js.Object:
  /** Creates a new Loader.
    *
    * @param manager
    *   The [[LoadingManager]] for the loader to use. Default is [[three.DefaultLoadingManager]].
    */
  def this(manager: LoadingManager = ???) = this()

  /** The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS. Default is
    * anonymous.
    */
  var crossOrigin: String = js.native

  /** Whether the XMLHttpRequest uses credentials. See .setWithCredentials.
    *
    * Default is false.
    */
  var withCredentials: Boolean = js.native

  /** The loadingManager the loader is using.
    *
    * Default is DefaultLoadingManager.
    */
  var manager: LoadingManager = js.native

  /** The base path from which the asset will be loaded.
    *
    * Default is the empty string.
    */
  var path: String = js.native

  /** The base path from which additional resources like textures will be loaded.
    *
    * Default is the empty string.
    */
  var resourcePath: String = js.native

  /** The request header used in HTTP request.
    *
    * See [[setRequestHeader]].
    *
    * Default is empty object.
    */
  var requestHeader: js.Object = js.native

  /** This method needs to be implement by all concrete loaders. It holds the logic for loading the asset from the
    * backend.
    */
  def load(): Unit = js.native

  /** [[onLoad]] is handled by [[Promise.resolve]] and [[onError]] is handled by [[Promise.reject]].
    *
    * @param url
    *   A string containing the path/URL of the file to be loaded.
    * @param onProgress
    *   (optional) — A function to be called while the loading is in progress. The argument will be the ProgressEvent
    *   instance, which contains .lengthComputable, .total and .loaded. If the server does not set the Content-Length
    *   header; .total will be 0.
    * @return
    *   This method is equivalent to [[load]], but returns a [[Promise]].
    */
  def loadAsync(url: String, onProgress: js.Function1[ProgressEvent, Unit] = js.native): Promise[js.Any] = js.native

  /** This method needs to be implement by all concrete loaders. It holds the logic for parsing the asset into three.js
    * entities.
    */
  def parse(): Unit = js.native

  /** @param crossOrigin
    *   The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS.
    * @return
    *   [[Loader]]
    */
  def setCrossOrigin(crossOrigin: String): Loader = js.native

  /** Whether the XMLHttpRequest uses credentials such as cookies, authorization headers or TLS client certificates. See
    * XMLHttpRequest.withCredentials. Note that this has no effect if you are loading files locally or from the same
    * domain.
    *
    * @return
    *   [[Loader]]
    */
  def setWithCredentials(value: Boolean): Loader = js.native

  /** @param path
    *   Set the base path for the asset.
    * @return
    *   [[Loader]]
    */
  def setPath(path: String): Loader = js.native

  /** @param resourcePath
    *   Set the base path for dependent resources like textures.
    * @return
    *   [[Loader]]
    */
  def setResourcePath(resourcePath: String): Loader = js.native

  /** Set the request header used in HTTP request.
    *
    * @param requestHeader
    *   key: The name of the header whose value is to be set. value: The value to set as the body of the header.
    * @return
    *   [[Loader]]
    */
  def setRequestHeader(requestHeader: js.Object): Loader = js.native

@js.native
trait ProgressEvent extends js.Object:
  val lengthComputable: Boolean = js.native
  val loaded: Double            = js.native
  val total: Double             = js.native
