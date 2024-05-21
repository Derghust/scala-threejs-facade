package org.tesseractrealm.threejsfacade
package core

import scala.scalajs.js
import scala.scalajs.js.annotation.*

// Object3D is extended by EventDispatcher but we dont need interact with it.
@js.native
@JSImport("three", JSImport.Namespace)
class Object3D extends js.Object:
  def add(obj: Object3D): Unit = js.native
