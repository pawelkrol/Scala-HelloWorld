object ProguardConf {

  val helloWorld =
"""
-dontnote
-dontwarn
-optimizations "code/allocation/*,code/merging,code/removal/*,code/simplification/*,class/marking/*,class/merging/*,class/unboxing/*,field/*,method/inlining/*,method/marking/*,method/propagation/*,method/removal/*"

-keep public class ch.qos.logback.core.ConsoleAppender {
  *;
}

-keep public class ch.qos.logback.core.FileAppender {
  *;
}

-keep public class ch.qos.logback.core.pattern.PatternLayoutEncoderBase {
  *;
}

-keep public class org.slf4j.impl.StaticMDCBinder {
  *;
}

-keep public class scopt.OParser$ {
  *;
}
"""
}
