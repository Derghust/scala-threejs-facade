package org.tesseractrealm.threejsfacade
package three.objects

import org.tesseractrealm.threejsfacade.three.core.{BufferGeometry, Object3D}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("three", "Mesh")
class Mesh(var geometry: BufferGeometry, var material: js.Object) extends Object3D {}
