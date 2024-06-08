package org.tesseractrealm.threejsfacade
package three.core

import scala.scalajs.js
import scala.scalajs.js.annotation.*

/** A Layers object assigns an [[Object3D]] to 1 or more of 32 layers numbered 0 to 31 - internally the layers are
  * stored as a bit mask, and by default all Object3Ds are a member of layer 0.
  *
  * This can be used to control visibility - an object must share a layer with a camera to be visible when that camera's
  * view is rendered.
  *
  * All classes that inherit from [[Object3D]] have an [[Object3D.layers]] property which is an instance of this class.
  *
  *     */
@js.native
@JSImport("three", "Layers")
class Layers extends js.Object:
  var mask: Int = js.native

  def disable(layer: Int): Unit      = js.native
  def enable(layer: Int): Unit       = js.native
  def set(layer: Int): Unit          = js.native
  def test(layers: Layers): Boolean  = js.native
  def isEnabled(layer: Int): Boolean = js.native
  def toggle(layer: Integer): Unit   = js.native
  def enableAll(): Unit              = js.native
  def disableAll(): Unit             = js.native
