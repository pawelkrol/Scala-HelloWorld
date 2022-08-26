package com.github.pawelkrol.HelloWorld

import scopt.OParser

class OptionParser(
  parser1: OParser[_, Arguments]
) {

  def parse(args: Array[String])(runWith: (Arguments) => Unit) = {

    OParser.parse(parser1, args, Arguments()) match {
      case Some(arguments) => {
        try {
          arguments.validate
        } catch {
          case e: Exception => {
            println(e.getMessage)
            System.exit(1)
          }
        }
        runWith(arguments)
      }
      case None =>
        // arguments are bad, error message will have been displayed
    }
  }
}

object OptionParser {

  private val builder = OParser.builder[Arguments]

  def apply() = {

    val parser1 = {
      import builder._
      OParser.sequence(
        programName("helloworld"),
        head("helloworld", "1.0.0-SNAPSHOT"),
        help("help").text("prints out this usage text"),
        opt[String]("name")
          .optional()
          .action((value: String, option: Arguments) => option.copy(name = value))
          .text("defines whom do you want to say \"Hello\" (e.g., \"Pawel\", defaults to \"World\")")
      )
    }

    new OptionParser(parser1)
  }
}
