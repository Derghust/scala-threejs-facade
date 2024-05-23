package org.tesseractrealm.threejsfacade
package three.geometries

import org.tesseractrealm.threejsfacade.three.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "ConeGeometry")
class ConeGeometry(
  var radius: Double = 1.0,
  var height: Double = 1.0,
  var radialSegments: Integer = 32,
  var heightSegments: Integer = 1,
  var openEnded: Boolean = false,
  var thetaStart: Double = 0.0,
  var thetaLength: Double = 2 * 3.14159
) extends CylinderGeometry {}
