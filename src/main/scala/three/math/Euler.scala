package org.tesseractrealm.threejsfacade
package three.math

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Euler")
class Euler extends js.Object:
  def this(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0, order: String = "XYZ") = this()

  val isEuler: Boolean = js.native
  var order: String    = js.native
  var x: Double        = js.native
  var y: Double        = js.native
  var z: Double        = js.native

  def copy(euler: Euler): Euler                                               = js.native
  override def clone(): Euler                                                 = js.native
  def equals(euler: Euler): Boolean                                           = js.native
  def fromArray(array: js.Array[Double]): Euler                               = js.native
  def reorder(newOrder: String): Euler                                        = js.native
  def set(x: Double, y: Double, z: Double, order: String = this.order): Euler = js.native
  def setFromRotationMatrix(m: Matrix4, order: String): Euler                 = js.native
