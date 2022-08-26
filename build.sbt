lazy val root = (project in file(".")).
  settings(
    javaOptions += "-Xmx1G",
    name := "helloworld",
    organization := "com.github.pawelkrol",
    scalaVersion := "3.1.3",
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-language:implicitConversions",
      "-unchecked",
      "-Xfatal-warnings"
    ),
    version := "1.0.0-SNAPSHOT"
  )

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.11",
  "com.github.scopt" %% "scopt" % "4.1.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "org.scalatest" %% "scalatest" % "3.2.13" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "." + artifact.extension
}

enablePlugins(SbtProguard)

Proguard / proguardFilteredInputs ++= ProguardOptions.noFilter((Compile / packageBin).value)

Proguard / proguardInputs := (Compile / dependencyClasspath).value.files

Proguard / proguardOptions += ProguardOptions.keepMain("com.github.pawelkrol.HelloWorld.Application")

Proguard / proguardOptions += ProguardConf.helloWorld

Proguard / proguardVersion := "7.2.2"
