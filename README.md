Scala-HelloWorld
================

`Hello World` is the most minimal [Scala](https://www.scala-lang.org/) project you can possibly imagine. It comes up bundled with the minimal set of dependencies required to build, test and run a standalone application JAR. It does not do anything besides printing out a `Hello World!` message to the console, and is meant to primarily serve as an empty template for a quick start to setup your own Scala application. Please adapt package and class names as well as build configuration files according to the needs of your program.

This `Hello World` application is setup with [sbt 1.2.7](http://www.scala-sbt.org/) as a build tool, [sbt-proguard 0.3.0](https://github.com/sbt/sbt-proguard) as an sbt [plugin](https://www.scala-sbt.org/1.x/docs/Using-Plugins.html) for running [ProGuard 6.0.3](http://proguard.sourceforge.net/), [ScalaTest 3.0.5](http://www.scalatest.org/) as a unit-testing framework, [scopt 3.7.0](https://github.com/scopt/scopt) as a command line options parsing library, [Scala Logging 3.9.0](https://github.com/lightbend/scala-logging) as a logging library wrapping [SLF4J](http://www.slf4j.org/), and [Logback 1.2.3](http://logback.qos.ch/) as a backend logging framework.

VERSION
-------

Version 0.05-SNAPSHOT (2018-12-01)

INSTALLATION
------------

Add the following automatic export to your `~/.bash_profile`:

    export _JAVA_OPTIONS="-Xms1024m -Xmx2G -Xss256m"

In order to build and run an application JAR type the following:

    $ git clone git://github.com/pawelkrol/Scala-HelloWorld.git
    $ cd Scala-HelloWorld
    $ sbt clean update compile test package proguard:proguard

    $ java -Dfile.encoding=UTF8 -jar target/scala-2.12/proguard/helloworld-0.05-SNAPSHOT.jar
    $ java -Dfile.encoding=UTF8 -jar target/scala-2.12/proguard/helloworld-0.05-SNAPSHOT.jar --help
    $ java -Dfile.encoding=UTF8 -jar target/scala-2.12/proguard/helloworld-0.05-SNAPSHOT.jar --name Pawel

COPYRIGHT AND LICENCE
---------------------

Copyright (C) 2015, 2016, 2018 by Pawel Krol.

This library is free open source software; you can redistribute it and/or modify it under [the same terms](https://github.com/pawelkrol/Scala-HelloWorld/blob/master/LICENSE.md) as Scala itself, either Scala version 2.12.7 or, at your option, any later version of Scala you may have available.
