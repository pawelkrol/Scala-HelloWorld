lazy val root = (project in file(".")).
  settings(
    name := "helloworld",
    scalaVersion := "2.13.3",
    scalacOptions ++= Seq("-deprecation", "-feature"),
    version := "0.07"
  )

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.github.scopt" %% "scopt" % "3.7.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "org.scalatest" %% "scalatest" % "3.2.2" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "." + artifact.extension
}

enablePlugins(SbtProguard)

proguardFilteredInputs in Proguard ++= ProguardOptions.noFilter((packageBin in Compile).value)

proguardInputs in Proguard := (dependencyClasspath in Compile).value.files

proguardOptions in Proguard += ProguardOptions.keepMain("com.github.pawelkrol.HelloWorld.Application")

proguardOptions in Proguard += ProguardConf.helloWorld

proguardVersion in Proguard := "7.0.0"
