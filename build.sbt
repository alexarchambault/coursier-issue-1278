
addSbtPlugin("com.github.gpgekko" % "sbt-autoprefixer" % "1.2.0")
dependencyOverrides ++= Seq(
  "org.webjars.npm" % "is-number" % "4.0.0",
  "org.webjars.npm" % "kind-of" % "6.0.0",
  "org.webjars.npm" % "string-width" % "2.0.0",
  "org.webjars.npm" % "strip-ansi" % "4.0.0",
  "org.webjars.npm" % "browserslist" % "2.10.0",
  "org.webjars.npm" % "caniuse-lite" % "1.0.30000748"
)
