package org.tesseractrealm.threejsfacade
package three.examples.jsm.renderers

import org.tesseractrealm.threejsfacade.three.cameras.Camera
import org.tesseractrealm.threejsfacade.three.core.Object3D
import org.tesseractrealm.threejsfacade.three.math.Vector2
import org.tesseractrealm.threejsfacade.three.scenes.Scene

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("three/examples/jsm/renderers/CSS2DRenderer", "CSS2DObject")
@js.native
class CSS2DObject extends Object3D:
  def this(element: js.Dynamic) = this()

  var isCSS2DObject: Boolean = js.native
  var element: js.Dynamic    = js.native
  var center: Vector2        = js.native

  def copy(source: CSS2DObject, recursive: Boolean): CSS2DObject = js.native

@JSImport("three/examples/jsm/renderers/CSS2DRenderer", "CSS2DRenderer")
@js.native
class CSS2DRenderer extends Object3D:
  def this(parameters: js.Object) = this()

  val domElement: js.Dynamic = js.native

  def getSize(): js.Object                       = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def setSize(width: Int, height: Int): Unit     = js.native
