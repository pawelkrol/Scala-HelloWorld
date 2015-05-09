assemblyJarName in assembly := "helloworld-0.02.jar"

test in assembly := {}

mainClass in assembly := Some("com.github.pawelkrol.HelloWorld.Application")