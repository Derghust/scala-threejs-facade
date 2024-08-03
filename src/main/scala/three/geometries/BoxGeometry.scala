package org.tesseractrealm.threejsfacade
package three.geometries

import org.tesseractrealm.threejsfacade.three.core.{BufferGeometry, Object3D}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "BoxGeometry")
class BoxGeometry extends BufferGeometry:
  def this(
    width: Float = 1.0,
    height: Float = 1.0,
    depth: Float = 1.0,
    widthSegments: Int = 1,
    heightSegments: Int = 1,
    depthSegments: Int = 1
  ) =
    this()

  var parameters: js.Object = js.native
