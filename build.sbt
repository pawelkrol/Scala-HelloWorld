lazy val root = (project in file(".")).
  settings(
    name := "helloworld",
    version := "0.04-SNAPSHOT",
    scalaVersion := "2.11.8"
  )

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.github.scopt" %% "scopt" % "3.4.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "." + artifact.extension
}

proguardSettings

ProguardKeys.filteredInputs in Proguard <++= (packageBin in Compile) map ProguardOptions.noFilter

ProguardKeys.inputs in Proguard <<= (dependencyClasspath in Compile) map { _.files }

ProguardKeys.options in Proguard += ProguardOptions.keepMain("com.github.pawelkrol.HelloWorld.Application")

ProguardKeys.options in Proguard += ProguardConf.helloWorld

ProguardKeys.proguardVersion in Proguard := "5.2.1"
