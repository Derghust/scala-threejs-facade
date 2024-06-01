package org.tesseractrealm.threejsfacade
package three.geometries

import org.tesseractrealm.threejsfacade.three.core.{BufferGeometry, Object3D}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "BoxGeometry")
class BoxGeometry extends BufferGeometry:
  def this(width: Float, height: Float, depth: Float, widthSegments: Int, heightSegments: Int, depthSegments: Int) =
    this()

  var parameters: js.Object = js.native
