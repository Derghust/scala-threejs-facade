import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

// Versioning for release THREEJS_VERSION, for snapshot THREEJS_VERSION-S_NUMBER
ThisBuild / version      := "r165-s7"
ThisBuild / scalaVersion := "3.3.3"

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

publishMavenStyle := true
description       := "Scala threeJS facade"
homepage          := Some(url("https://tesseract-realm.com"))
licenses += ("MIT", url("https://opensource.org/license/mit"))

publishTo := Some(
  "Gitea Packages" at sys.env.getOrElse("MAVEN_REPO_URL", "FAIL_ME")
)

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name             := "scala-threejs-facade",
    idePackagePrefix := Some("org.tesseractrealm.threejsfacade")
  )
