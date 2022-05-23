import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "replicate-scala-log-bug",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.10",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
