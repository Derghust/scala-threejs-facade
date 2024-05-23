package org.tesseractrealm.threejsfacade
package three.scenes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

/** This class contains the parameters that define exponential squared fog, which gives a clear view near the camera and
  * a faster than exponentially densening fog farther from the camera.
  *
  * Documentation [[https://threejs.org/docs/?q=fog#api/en/scenes/FogExp2]].
  *
  * Source [[https://github.com/mrdoob/three.js/blob/dev/src/scenes/FogExp2.js]].
  */
@js.native
@JSImport("three", "FogExp2")
class FogExp2 extends js.Object:
  def this(color: Int, density: Double = 0.00025) = this()

  var color: Int      = js.native
  var density: Double = js.native
