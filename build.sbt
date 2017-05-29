name := "SJS_TCI_Template"
version := "1.0"
scalaVersion := "2.12.2"

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "org.scalatest" %%% "scalatest" % "3.0.1" % "test", // Testing framework
  "org.scala-js" %%% "scalajs-dom" % "0.9.2", // Dom facade
  "be.doeraene" %%% "scalajs-jquery" % "0.9.1" // JQuery facade
)