logLevel := Level.Warn

resolvers ++= Seq(
  Classpaths.typesafeReleases,
  Classpaths.sbtPluginReleases,
  "jgit-repo" at "http://download.eclipse.org/jgit/maven"
)

addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.1.1")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.9")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.3.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.2")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
