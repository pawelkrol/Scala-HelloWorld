Scala-HelloWorld
================

`Hello World` is the most minimal [Scala 2.13](https://www.scala-lang.org/) project you can possibly imagine. It comes up bundled with the minimal set of dependencies required to build, test and run a standalone application JAR. It does not do anything besides printing out a `Hello World!` message to the console, and is meant to primarily serve as an empty template for a quick start to setup your own Scala application. Please adapt package and class names as well as build configuration files according to the needs of your program.

This `Hello World` application is setup with [sbt 1.3.13](http://www.scala-sbt.org/) as a build tool, [sbt-proguard 0.4.0](https://github.com/sbt/sbt-proguard) as an sbt [plugin](https://www.scala-sbt.org/1.x/docs/Using-Plugins.html) for running [ProGuard 7.1.1](http://proguard.sourceforge.net/), [ScalaTest 3.2.9](http://www.scalatest.org/) as a unit-testing framework, [scopt 4.0.1](https://github.com/scopt/scopt) as a command line options parsing library, [Scala Logging 3.9.4](https://github.com/lightbend/scala-logging) as a logging library wrapping [SLF4J](http://www.slf4j.org/), and [Logback 1.2.5](http://logback.qos.ch/) as a backend logging framework.

VERSION
-------

Version 0.08 (2021-08-15)

INSTALLATION
------------

Add the following automatic export to your `~/.bash_profile`:

    export _JAVA_OPTIONS="-Xms1024m -Xmx2G -Xss256m"

Install [ProGuard](http://proguard.sourceforge.net/) prerequisites:

    $ sudo dnf install java-11-openjdk-jmods

In order to build and run an application JAR type the following:

    $ git clone git://github.com/pawelkrol/Scala-HelloWorld.git
    $ cd Scala-HelloWorld
    $ sbt clean update compile test package proguard:proguard

    $ java -Dfile.encoding=UTF8 -jar target/scala-2.13/proguard/helloworld-0.08.jar
    $ java -Dfile.encoding=UTF8 -jar target/scala-2.13/proguard/helloworld-0.08.jar --help
    $ java -Dfile.encoding=UTF8 -jar target/scala-2.13/proguard/helloworld-0.08.jar --name Pawel

COPYRIGHT AND LICENCE
---------------------

Copyright (C) 2015-2021 by Pawel Krol.

This library is free open source software; you can redistribute it and/or modify it under [the same terms](https://github.com/pawelkrol/Scala-HelloWorld/blob/master/LICENSE.md) as Scala itself, either Scala version 2.13.6 or, at your option, any later version of Scala you may have available.
