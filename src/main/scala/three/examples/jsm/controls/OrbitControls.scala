package org.tesseractrealm.threejsfacade
package three.examples.jsm.controls

import org.tesseractrealm.threejsfacade.three.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("three/examples/jsm/controls/OrbitControls", "OrbitControls")
@js.native
class OrbitControls(camera: Object3D, domElement: js.Dynamic) extends Object3D:
  var autoRotate: Boolean         = js.native
  var autoRotateSpeed: Double     = js.native
  var enableDamping: Boolean      = js.native
  var dampingFactor: Double       = js.native
  var enableZoom: Boolean         = js.native
  var zoomSpeed: Double           = js.native
  var enableRotate: Boolean       = js.native
  var rotateSpeed: Double         = js.native
  var enablePan: Boolean          = js.native
  var keyPanSpeed: Double         = js.native
  var screenSpacePanning: Boolean = js.native
  var minDistance: Double         = js.native
  var maxDistance: Double         = js.native
  var minZoom: Double             = js.native
  var maxZoom: Double             = js.native
  var minPolarAngle: Double       = js.native
  var maxPolarAngle: Double       = js.native
  var minAzimuthAngle: Double     = js.native
  var maxAzimuthAngle: Double     = js.native
  var enableKeys: Boolean         = js.native
  var keys: js.Object             = js.native
  var mouseButtons: js.Object     = js.native
  var touches: js.Object          = js.native

  def update(): Unit              = js.native
  def saveState(): Unit           = js.native
  def reset(): Unit               = js.native
  def dispose(): Unit             = js.native
  def getPolarAngle(): Double     = js.native
  def getAzimuthalAngle(): Double = js.native
  def getDistance(): Double       = js.native
