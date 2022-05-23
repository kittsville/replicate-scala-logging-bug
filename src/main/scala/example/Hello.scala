package example

import org.slf4j.LoggerFactory

object Hello extends App {
  val underlying = com.typesafe.scalalogging.Logger(LoggerFactory.getLogger(getClass.getName))
  val logger = new LogWrapper(underlying)

  logger.info("Hello {}", "World")
}
