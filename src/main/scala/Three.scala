package org.github.derghust

import scala.scalajs.js
import scala.scalajs.js.annotation.*

@js.native
@JSGlobal("THREE")
object Three extends js.Object:
  @js.native
  class Scene() extends js.Object:
    def add(obj: Object3D): Unit = js.native

  @js.native
  class PerspectiveCamera(fov: Double, aspect: Double, near: Double, far: Double) extends js.Object:
    var position: js.Dynamic = js.native

  @js.native
  class WebGLRenderer() extends js.Object:
    def setSize(width: Double, height: Double): Unit = js.native

    def render(scene: Scene, camera: PerspectiveCamera): Unit = js.native

    val domElement: js.Dynamic = js.native

  @js.native
  class BoxGeometry(width: Double, height: Double, depth: Double) extends js.Object

  @js.native
  class MeshBasicMaterial(parameters: js.Dynamic) extends js.Object

  @js.native
  class Mesh(geometry: BoxGeometry, material: MeshBasicMaterial) extends Object3D:
    var rotation: Euler = js.native

  @js.native
  class Object3D() extends js.Object

  @js.native
  class Euler() extends js.Object:
    var x: Double = js.native
    var y: Double = js.native
