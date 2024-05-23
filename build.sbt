import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.3"

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

publishMavenStyle := true
organization      := "org.tesseractrealm"
description       := "Scala threeJS facade"
homepage          := Some(url("https://tesseract-realm.com"))
licenses += ("MIT", url("https://opensource.org/license/mit"))
developers := List(
  Developer(
    id = "derghust",
    name = "Damien Clément",
    email = "damien.clement.czech@gmail.com",
    url = url("https://tesseract-realm.com/developer/damien-clement")
  )
)

publishTo := Some(
  ("Gitea Packages" at "http://192.168.50.83:3000/api/packages/TesseractRealm/maven").withAllowInsecureProtocol(true)
)

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name             := "scala-threejs-facade",
    idePackagePrefix := Some("org.tesseractrealm.threejsfacade")
  )
