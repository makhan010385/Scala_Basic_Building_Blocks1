ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"
libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.3.16"
lazy val root = (project in file("."))
  .settings(
    name := "Scala_Basic_Building_Blocks"

  )
