package org.tesseractrealm.threejsfacade
package three.scenes

import org.tesseractrealm.threejsfacade.three.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Scene")
class Scene extends Object3D:
  var background: js.Object = js.native
  var fog: js.Object        = js.native
