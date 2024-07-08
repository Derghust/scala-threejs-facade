package org.tesseractrealm.threejsfacade
package three.materials

import org.tesseractrealm.threejsfacade.three.math.Color
import org.tesseractrealm.threejsfacade.three.textures.Texture

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "SpriteMaterial")
class SpriteMaterial extends Material:
  def this(parameters: js.Object) = this()

  var alphaMap: Texture         = js.native
  var color: Color              = js.native
  var fog: Boolean              = js.native
  var isSpriteMaterial: Boolean = js.native
  var map: Texture              = js.native
//  var rotation: Radians         = js.native
  var sizeAttenuation: Boolean = js.native
