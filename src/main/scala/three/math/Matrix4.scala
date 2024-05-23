package org.tesseractrealm.threejsfacade
package three.math

import scala.scalajs.js
import scala.scalajs.js.typedarray.Float32Array
import scala.scalajs.js.annotation.*

@js.native
@JSImport("three", "Matrix4")
class Matrix4 extends js.Object:
  def this(
    n11: Double,
    n12: Double,
    n13: Double,
    n14: Double,
    n21: Double,
    n22: Double,
    n23: Double,
    n24: Double,
    n31: Double,
    n32: Double,
    n33: Double,
    n34: Double,
    n41: Double,
    n42: Double,
    n43: Double,
    n44: Double
  ) = this()

  var element: js.Array[Double] = js.native

  def set(
    n11: Double,
    n12: Double,
    n13: Double,
    n14: Double,
    n21: Double,
    n22: Double,
    n23: Double,
    n24: Double,
    n31: Double,
    n32: Double,
    n33: Double,
    n34: Double,
    n41: Double,
    n42: Double,
    n43: Double,
    n44: Double
  ): Matrix4 = js.native

  def identity(): Matrix4                                                   = js.native
  override def clone(): Matrix4                                             = js.native
  def copy(m: Matrix4): Matrix4                                             = js.native
  def copyPosition(m: Matrix4): Matrix4                                     = js.native
  def extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4 = js.native
  def makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4    = js.native
  def extractRotation(m: Matrix4): Matrix4                                  = js.native
  def makeRotationFromEuler(euler: Euler): Matrix4                          = js.native
  def makeRotationFromQuaternion(q: Quaternion): Matrix4                    = js.native
  def lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4           = js.native

  def multiply(m: Matrix4): Matrix4                                         = js.native
  def premultiply(m: Matrix4): Matrix4                                      = js.native
  def multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4                     = js.native
  def multiplyToArray(a: Matrix4, b: Matrix4, r: js.Array[Double]): Matrix4 = js.native
  def determinant(): Double                                                 = js.native

  def transpose(): Matrix4                                      = js.native
  def setPosition(v: Vector3): Matrix4                          = js.native
  def invert(): Matrix4                                         = js.native
  def scale(v: Vector3): Matrix4                                = js.native
  def getMaxScaleOnAxis(): Double                               = js.native
  def makeTranslation(x: Double, y: Double, z: Double): Matrix4 = js.native
  def makeRotationX(theta: Double): Matrix4                     = js.native
  def makeRotationY(theta: Double): Matrix4                     = js.native
  def makeRotationZ(theta: Double): Matrix4                     = js.native
  def makeRotationAxis(axis: Vector3, angle: Double): Matrix4   = js.native
  def makeScale(x: Double, y: Double, z: Double): Matrix4       = js.native
  def makeShear(x: Double, y: Double, z: Double): Matrix4       = js.native

  def compose(position: Vector3, quaternion: Quaternion, scale: Vector3): Matrix4   = js.native
  def decompose(position: Vector3, quaternion: Quaternion, scale: Vector3): Matrix4 = js.native

  def makePerspective(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): Matrix4 =
    js.native
  def makeOrthographic(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double): Matrix4 =
    js.native

  def equals(matrix: Matrix4): Boolean = js.native

  def fromArray(array: js.Array[Double], offset: Int = 0): Matrix4                    = js.native
  def fromArray(array: Float32Array, offset: Int): Matrix4                            = js.native
  def toArray(array: js.Array[Double] = js.native, offset: Int = 0): js.Array[Double] = js.native
  def toArray(array: Float32Array, offset: Int): Float32Array                         = js.native
