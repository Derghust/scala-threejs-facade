package org.tesseractrealm.threejsfacade
package three.constants

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait Shader extends js.Object:
  var uniforms: js.Dictionary[js.Any] = js.native
  var vertexShader: String            = js.native
  var fragmentShader: String          = js.native
