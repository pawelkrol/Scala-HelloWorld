lazy val root = (project in file(".")).
  settings(
    name := "helloworld",
    version := "0.05-SNAPSHOT",
    scalaVersion := "2.12.1"
  )

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.8",
  "com.github.scopt" %% "scopt" % "3.5.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "." + artifact.extension
}

proguardSettings

ProguardKeys.filteredInputs in Proguard <++= (packageBin in Compile) map ProguardOptions.noFilter

ProguardKeys.inputs in Proguard := { (dependencyClasspath in Compile).value.files }

ProguardKeys.options in Proguard += ProguardOptions.keepMain("com.github.pawelkrol.HelloWorld.Application")

ProguardKeys.options in Proguard += ProguardConf.helloWorld

ProguardKeys.proguardVersion in Proguard := "5.3.2"
