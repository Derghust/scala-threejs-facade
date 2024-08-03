package org.tesseractrealm.threejsfacade
package three.constants

import scala.scalajs.js
import scala.scalajs.js.annotation.*

@js.native
@JSImport("three", "NoBlending")
object NoBlending extends Blending

@js.native
@JSImport("three", "NormalBlending")
object NormalBlending extends Blending

@js.native
@JSImport("three", "AdditiveBlending")
object AdditiveBlending extends Blending

@js.native
@JSImport("three", "SubtractiveBlending")
object SubtractiveBlending extends Blending

@js.native
@JSImport("three", "MultiplyBlending")
object MultiplyBlending extends Blending

@js.native
@JSImport("three", "CustomBlending")
object CustomBlending extends Blending

@js.native
sealed trait Blending extends js.Object
