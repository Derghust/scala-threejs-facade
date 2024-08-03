package org.tesseractrealm.threejsfacade
package three.math

import scala.scalajs.js
import scala.scalajs.js.annotation.*

@js.native
@JSImport("three", "Quaternion")
class Quaternion extends js.Object:
  def this(x: Double, y: Double, z: Double, w: Double) = this()

  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
