lazy val root = (project in file(".")).
  settings(
    name := "helloworld",
    version := "0.02",
    scalaVersion := "2.11.8"
  )

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
