package org.tesseractrealm.threejsfacade
package three.cameras

import org.tesseractrealm.threejsfacade.three.core.Object3D

import scala.scalajs.js
import scala.scalajs.js.annotation.*

@js.native
@JSImport("three", "OrthographicCamera")
class OrthographicCamera(
  val left: Double,
  val right: Double,
  val top: Double,
  val bottom: Double,
  val near: Double,
  val far: Double
) extends Object3D:
  var zoom: Double                = js.native
  var view: js.UndefOr[js.Object] = js.native
  var focus: Double               = js.native

  def updateProjectionMatrix(): Unit = js.native
  def setViewOffset(
    fullWidth: Double,
    fullHeight: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  def clearViewOffset(): Unit = js.native
