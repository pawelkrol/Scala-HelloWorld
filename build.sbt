lazy val root = (project in file(".")).
  settings(
    name := "helloworld",
    version := "0.01",
    scalaVersion := "2.11.6"
  )

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"