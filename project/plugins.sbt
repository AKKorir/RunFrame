// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.20")
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "6.2.0-RC4")

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.13.1")

