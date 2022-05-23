package example

import com.typesafe.scalalogging.Logger

class LogWrapper (val underlying: Logger) {
  // Imagine some DataDog/Bugsnag/analytics/etc. magic here that'd justify wrapping the logger

  def info(message: String, args: AnyRef*): Unit = underlying.info(message, args: _*)
}
