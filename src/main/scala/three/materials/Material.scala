package org.tesseractrealm.threejsfacade
package three.materials

import org.tesseractrealm.threejsfacade.three.Three.WebGLRenderer
import org.tesseractrealm.threejsfacade.three.constants.{Blending, Shader}
import org.tesseractrealm.threejsfacade.three.core.EventDispatcher
import org.tesseractrealm.threejsfacade.three.math.Color

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Material")
class Material extends EventDispatcher:
  var alphaHash: Boolean            = js.native
  var alphaTest: Double             = js.native
  var alphaToCoverage: Boolean      = js.native
  var blendAlpha: Double            = js.native
  var blendColor: Color             = js.native
  var blendDst: Int                 = js.native
  var blendDstAlpha: Int            = js.native
  var blendEquation: Int            = js.native
  var blendEquationAlpha: Int       = js.native
  var blending: Blending            = js.native
  var blendSrc: Int                 = js.native
  var blendSrcAlpha: Int            = js.native
  var clipIntersection: Boolean     = js.native
  var clippingPlanes: js.Array[Any] = js.native
  var clipShadows: Boolean          = js.native
  var colorWrite: Boolean           = js.native
  var defines: js.Object            = js.native
  var depthFunc: Int                = js.native
  var depthTest: Boolean            = js.native
  var depthWrite: Boolean           = js.native
  var forceSinglePass: Boolean      = js.native
  var isMaterial: Boolean           = js.native
  var stencilWrite: Boolean         = js.native
  var stencilWriteMask: Int         = js.native
  var stencilFunc: Int              = js.native
  var stencilRef: Int               = js.native
  var stencilFuncMask: Int          = js.native
  var stencilFail: Int              = js.native
  var stencilZFail: Int             = js.native
  var stencilZPass: Int             = js.native
  var id: Int                       = js.native
  var name: String                  = js.native
  var needsUpdate: Boolean          = js.native
  var opacity: Double               = js.native
  var polygonOffset: Boolean        = js.native
  var polygonOffsetFactor: Int      = js.native
  var polygonOffsetUnits: Int       = js.native
  var precision: String             = js.native
  var premultipliedAlpha: Boolean   = js.native
  var dithering: Boolean            = js.native
  var shadowSide: Int               = js.native
  var side: Int                     = js.native
  var toneMapped: Boolean           = js.native
  var transparent: Boolean          = js.native
  var `type`: String                = js.native
  var uuid: String                  = js.native
  var version: Int                  = js.native
  var vertexColors: Boolean         = js.native
  var visible: Boolean              = js.native
  var userData: js.Object           = js.native

  override def clone(): Material                                     = js.native
  def copy(material: Material): Material                             = js.native
  def dispose(): Unit                                                = js.native
  def onBeforeCompile(shader: Shader, renderer: WebGLRenderer): Unit = js.native
  def customProgramCacheKey(): String                                = js.native
  def setValues(values: js.Object): Unit                             = js.native
  def toJSON(meta: js.Object): js.Object                             = js.native
