package org.tesseractrealm.threejsfacade
package three.cameras

import org.tesseractrealm.threejsfacade.three.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.*

/** Camera that uses [[https://en.wikipedia.org/wiki/Orthographic_projection orthographic projection]].
  *
  * In this projection mode, an object's size in the rendered image stays constant regardless of its distance from the
  * camera.
  *
  * This can be useful for rendering 2D scenes and UI elements, amongst other things.
  */
@js.native
@JSImport("three", "OrthographicCamera")
class OrthographicCamera(
) extends Camera:
  /** Together these define the camera's [[https://en.wikipedia.org/wiki/Viewing_frustum viewing frustum]].
    *
    * @param left
    *   Camera frustum left plane.
    * @param right
    *   Camera frustum right plane.
    * @param top
    *   Camera frustum top plane.
    * @param bottom
    *   Camera frustum bottom plane.
    * @param near
    *   Camera frustum near plane.
    * @param far
    *   Camera frustum far plane.
    */
  def this(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double) = this()

  /** Camera frustum bottom plane.
    */
  var bottom: Double = js.native

  /** Camera frustum far plane. Default is 2000.
    *
    * Must be greater than the current value of [[near]] plane.
    */
  var far: Double = js.native

  /** Read-only flag to check if a given object is of type OrthographicCamera.
    */
  var isOrthographicCamera: Boolean = js.native

  /** Camera frustum left plane.
    */
  var left: Double = js.native

  /** Camera frustum near plane. Default is 0.1.
    *
    * The valid range is between 0 and the current value of the [[far]] plane. Note that, unlike for the
    * [[PerspectiveCamera]], 0 is a valid value for an [[OrthographicCamera]]'s near plane.
    */
  var near: Double = js.native

  /** Camera frustum right plane.
    */
  var right: Double = js.native

  /** Camera frustum top plane.
    */
  var top: Double = js.native

  /** Set by [[setViewOffset]]. Default is null.
    */
  var zoom: Double = js.native

  /** Gets or sets the zoom factor of the camera. Default is 1.
    */
  var view: js.Object = js.native

  /** Sets an offset in a larger [[https://en.wikipedia.org/wiki/Viewing_frustum viewing frustum]]. This is useful for
    * multi-window or multi-monitor/multi-machine setups. For an example on how to use it see [[PerspectiveCamera]].
    *
    * @param fullWidth
    *   full width of multiview setup
    * @param fullHeight
    *   full height of multiview setup
    * @param offsetX
    *   horizontal offset of subcamera
    * @param offsetY
    *   vertical offset of subcamera
    * @param width
    *   width of subcamera
    * @param height
    *   height of subcamera
    */
  def setViewOffset(
    fullWidth: Double,
    fullHeight: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double,
    height: Double
  ): Unit = js.native

  /** Removes any offset set by the .setViewOffset method.
    */
  def clearViewOffset(): Unit = js.native

  /** Updates the camera projection matrix. Must be called after any change of parameters.
    */
  def updateProjectionMatrix(): Unit = js.native

  /** @param meta
    *   object containing metadata such as textures or images in objects' descendants. Convert the camera to three.js
    *   JSON Object/Scene format.
    * @return
    */
  def toJSON(meta: js.Object): js.Object = js.native
