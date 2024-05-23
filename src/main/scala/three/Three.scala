package org.tesseractrealm.threejsfacade
package three

import core.Object3D
import org.tesseractrealm.threejsfacade.three.math.Euler
import org.tesseractrealm.threejsfacade.three.scenes.Scene

import scala.scalajs.js
import scala.scalajs.js.annotation.*

@js.native
@JSImport("three", JSImport.Namespace)
object Three extends js.Object:
  @js.native
  class WebGLRenderer() extends js.Object:
    def setSize(width: Double, height: Double): Unit = js.native

    def render(scene: Scene, camera: Object3D): Unit = js.native

    val domElement: js.Dynamic = js.native

  @js.native
  class BoxGeometry(width: Double, height: Double, depth: Double) extends js.Object

  @js.native
  class MeshBasicMaterial(parameters: js.Dynamic) extends js.Object
