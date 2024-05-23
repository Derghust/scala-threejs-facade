package org.tesseractrealm.threejsfacade
package three.math

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Vector3")
class Vector3(var x: Double, var y: Double, var z: Double) extends js.Object:
  def set(x: Double, y: Double, z: Double): Unit = js.native
