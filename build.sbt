lazy val root = (project in file(".")).
  settings(
    name := "helloworld",
    version := "0.02",
    scalaVersion := "2.11.6"
  )

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)