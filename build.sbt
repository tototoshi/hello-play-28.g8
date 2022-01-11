lazy val `hello-play-28` = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "hello-play-28",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatest" %% "scalatest" % "3.2.10" % "test"
    )
  )
