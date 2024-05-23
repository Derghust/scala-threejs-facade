package org.tesseractrealm.threejsfacade
package three.math

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Color")
class Color extends js.Object:
  def this(color: String) = this()
  def this(color: Int) = this()
  def this(r: Double, g: Double, b: Double) = this()

  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
