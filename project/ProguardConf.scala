object ProguardConf {

  val helloWorld =
"""
-dontnote
-dontwarn
-ignorewarnings

-keep public class ch.qos.logback.core.ConsoleAppender {
  *;
}

-keep public class ch.qos.logback.core.FileAppender {
  *;
}

-keep public class ch.qos.logback.core.pattern.PatternLayoutEncoderBase {
  *;
}
"""
}
