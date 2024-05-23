package org.tesseractrealm.threejsfacade
package three.core

import org.tesseractrealm.threejsfacade.three.math.{Euler, Vector3}

import scala.scalajs.js
import scala.scalajs.js.annotation.*

@js.native
@JSImport("three", "Object3D")
class Object3D extends EventDispatcher:
  var position: Vector3         = js.native
  var rotation: Euler           = js.native
  var matrixAutoUpdate: Boolean = js.native

  def add(obj: Object3D): Unit                      = js.native
  def updateMatrix(): Unit                          = js.native
  def lookAt(x: Double, y: Double, z: Double): Unit = js.native
