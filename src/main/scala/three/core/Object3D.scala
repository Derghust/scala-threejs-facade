package org.tesseractrealm.threejsfacade
package three.core

import org.tesseractrealm.threejsfacade.three.math.{Euler, Vector3}

import scala.scalajs.js
import scala.scalajs.js.annotation.*

// Object3D is extended by EventDispatcher but we dont need interact with it.
@js.native
@JSImport("three", "Object3D")
class Object3D extends js.Object:
  var position: Vector3        = js.native
  var rotation: Euler          = js.native
  def add(obj: Object3D): Unit = js.native
