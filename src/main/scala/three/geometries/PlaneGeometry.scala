package org.tesseractrealm.threejsfacade
package three.geometries

import org.tesseractrealm.threejsfacade.three.core.BufferGeometry

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "PlaneGeometry")
class PlaneGeometry extends BufferGeometry:
  def this(width: Double = 1.0, height: Double = 1.0, widthSegments: Int = 1, heightSegments: Int = 1) = this()

  var width: Double       = js.native
  var height: Double      = js.native
  var widthSegments: Int  = js.native
  var heightSegments: Int = js.native
