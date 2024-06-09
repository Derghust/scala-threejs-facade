package org.tesseractrealm.threejsfacade
package three.objects

import org.tesseractrealm.threejsfacade.three.core.{BufferGeometry, Object3D}
import org.tesseractrealm.threejsfacade.three.materials.Material

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Sprite")
class Sprite extends Object3D:
  def this(material: Material) = this()

  val isSprite: Boolean        = js.native
  var material: SpriteMaterial = js.native
  var center: Vector2          = js.native

  def clone(): Sprite                                                = js.native
  def copy(sprite: Sprite): Sprite                                   = js.native
  def raycast(raycaster: Raycaster, intersects: js.Array[Any]): Unit = js.native
