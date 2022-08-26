Scala-HelloWorld
================

`Hello World` is the most minimal [Scala 3] project you can possibly imagine. It comes up bundled with the minimal set of dependencies required to build, test and run a standalone application JAR. It does not do anything besides printing out a `Hello World!` message to the console, and is meant to primarily serve as an empty template for a quick start to setup your own Scala application. Please adapt package and class names as well as build configuration files according to the needs of your program.

This `Hello World` application is setup with [sbt 1.7.1] as a build tool, [sbt-proguard 0.5.0] as an sbt [plugin] for running [ProGuard 7.2.2], [ScalaTest 3.2.13] as a unit-testing framework, [scopt 4.1.0] as a command line options parsing library, [Scala Logging 3.9.5] as a logging library wrapping [SLF4J], and [Logback 1.2.11] as a backend logging framework.

VERSION
-------

Version 1.0.0-SNAPSHOT (2022-08-26)

INSTALLATION
------------

Add the following automatic export to your `~/.bash_profile`:

    export _JAVA_OPTIONS="-Xms1024m -Xmx2G -Xss256m"

Install JMods for OpenJDK 17 to be able to use [ProGuard]:

    $ sudo dnf install java-17-openjdk-jmods

In order to build and run an application JAR type the following:

    $ git clone git://github.com/pawelkrol/Scala-HelloWorld.git
    $ cd Scala-HelloWorld
    $ sbt clean update compile test package proguard:proguard

    $ java -Dfile.encoding=UTF8 -jar target/scala-3.1.3/proguard/helloworld-1.0.0-SNAPSHOT.jar
    $ java -Dfile.encoding=UTF8 -jar target/scala-3.1.3/proguard/helloworld-1.0.0-SNAPSHOT.jar --help
    $ java -Dfile.encoding=UTF8 -jar target/scala-3.1.3/proguard/helloworld-1.0.0-SNAPSHOT.jar --name Pawel

COPYRIGHT AND LICENCE
---------------------

Copyright (C) 2015-2022 by Pawel Krol.

This library is free open source software; you can redistribute it and/or modify it under [the same terms] as Scala itself, either Scala version 3.1.3 or, at your option, any later version of Scala you may have available.


[Logback 1.2.11]: http://logback.qos.ch/
[ProGuard 7.2.2]: https://github.com/Guardsquare/proguard/releases/tag/v7.1.1
[ProGuard]: https://github.com/Guardsquare/proguard
[SLF4J]: http://www.slf4j.org/
[Scala 3]: https://www.scala-lang.org/
[Scala Logging 3.9.5]: https://github.com/lightbend/scala-logging
[ScalaTest 3.2.13]: http://www.scalatest.org/
[plugin]: https://www.scala-sbt.org/1.x/docs/Using-Plugins.html
[sbt 1.7.1]: http://www.scala-sbt.org/
[sbt-proguard 0.5.0]: https://github.com/sbt/sbt-proguard
[scopt 4.1.0]: https://github.com/scopt/scopt
[the same terms]: https://github.com/pawelkrol/Scala-HelloWorld/blob/master/LICENSE.md
