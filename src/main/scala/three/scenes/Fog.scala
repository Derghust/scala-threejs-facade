package org.tesseractrealm.threejsfacade
package three.scenes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Fog")
class Fog(var color: Int, var near: Double, var far: Double) extends js.Object {}
