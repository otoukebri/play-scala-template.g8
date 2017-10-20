package $organisation_domain$.$organisation$

import sbt._

/**
  * Dependencies referenced in project auto-plugin and build code
  */
object Dependencies {
  val cats: ModuleID = "org.typelevel" %% "cats-core" % "1.0.0-MF"
  val playScalatest: ModuleID =
    "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0"
  val typesafeConfig: ModuleID = "com.typesafe" % "config" % "1.3.1"
  val validatedConfig: ModuleID =
    "net.cakesolutions" %% "validated-config" % "1.1.2"
  val webjars: ModuleID = "org.webjars" % "swagger-ui" % "3.0.21"

  object GatlingDependencies {
    val version = "2.2.5"

    val app: ModuleID = "io.gatling" % "gatling-app" % version
    val http: ModuleID = "io.gatling" % "gatling-http" % version
    val testkit: ModuleID = "io.gatling" % "gatling-test-framework" % version
  }

  object Refined {
    val version: String = "0.8.2"

    val core: ModuleID = "eu.timepit" %% "refined" % version
    val scalacheck: ModuleID = "eu.timepit" %% "refined-scalacheck" % version
  }
}
