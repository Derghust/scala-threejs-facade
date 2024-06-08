package org.tesseractrealm.threejsfacade
package three.cameras

import org.tesseractrealm.threejsfacade.three.core.{Layers, Object3D}
import org.tesseractrealm.threejsfacade.three.math.{Matrix4, Vector3}

import scala.scalajs.js
import scala.scalajs.js.annotation.*

/** Abstract base class for cameras. This class should always be inherited when you build a new camera.
  */
@js.native
@JSImport("three", "Camera")
class Camera extends Object3D:
  /** Read-only flag to check if a given object is of type Camera.
    */
  val isCamera: Boolean = js.native

  /** The [[Layers]] that the camera is a member of. This is an inherited property from [[Object3D]].
    *
    * Objects must share at least one layer with the camera to be seen when the camera's viewpoint is rendered.
    */
  var layers: Layers = js.native

  /** This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
    */
  var matrixWorldInverse: Matrix4 = js.native

  /** This is the matrix which contains the projection.
    */
  var projectionMatrix: Matrix4 = js.native

  /** The inverse of projectionMatrix.
    */
  var projectionMatrixInverse: Matrix4 = js.native

  /** Return a new camera with the same properties as this one.
    * @return
    *   [[Camera]]
    */
  override def clone(): Camera = js.native

  /** Copy the properties from the source camera into this one.
    *
    * @param source
    * @param recursive
    * @return
    *   self [[Camera]]
    */
  def copy(source: Camera, recursive: Boolean): Camera = js.native

  /** Returns a [[Vector3]] representing the world space direction in which the camera is looking. (Note: A camera looks
    * down its local, negative z-axis).
    *
    * @param target
    *   the result will be copied into this Vector3.
    * @return
    *   [[Vector3]]
    */
  def getWorldDirection(target: Vector3): Vector3 = js.native
