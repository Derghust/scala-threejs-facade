package org.tesseractrealm.threejsfacade
package three.light

import org.tesseractrealm.threejsfacade.three.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Light")
class Light(var color: Int, var intensity: Double) extends Object3D {}
