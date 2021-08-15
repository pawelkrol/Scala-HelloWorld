lazy val root = (project in file(".")).
  settings(
    name := "helloworld",
    scalaVersion := "2.13.6",
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-language:implicitConversions",
      "-unchecked",
      "-Xfatal-warnings"
    ),
    version := "0.08-SNAPSHOT"
  )


libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.5",
  "com.github.scopt" %% "scopt" % "4.0.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "." + artifact.extension
}

enablePlugins(SbtProguard)

Proguard / proguardFilteredInputs ++= ProguardOptions.noFilter((Compile / packageBin).value)

Proguard / proguardInputs := (Compile / dependencyClasspath).value.files

Proguard / proguardOptions += ProguardOptions.keepMain("com.github.pawelkrol.HelloWorld.Application")

Proguard / proguardOptions += ProguardConf.helloWorld

Proguard / proguardVersion := "7.1.1"
