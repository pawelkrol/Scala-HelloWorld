package com.github.pawelkrol.HelloWorld

import com.typesafe.scalalogging.StrictLogging

object Application extends StrictLogging {

  private val parser = OptionParser()

  def main(args: Array[String]) = {
    parser.parse(args) { runWith(_) }
  }

  def runWith(arguments: Arguments): Unit = {
    logger.debug("Printing out hello message")
    println(Message.hello(arguments.name))
  }
}
