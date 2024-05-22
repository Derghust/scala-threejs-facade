package org.tesseractrealm.threejsfacade
package camera

import core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "PerspectiveCamera")
class PerspectiveCamera(fov: Double, aspect: Double, near: Double, far: Double) extends Object3D
