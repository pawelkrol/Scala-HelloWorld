package com.github.pawelkrol.HelloWorld

import com.typesafe.scalalogging.StrictLogging

object Application extends StrictLogging {
  def main(args: Array[String]) = {
    logger.debug("Printing out hello world message")
    println(Message.hello)
  }
}