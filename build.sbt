import sbt._
import Process._
import Keys._

name := "scala-ss-demo"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
	//"org.mockito" % "mockito-core" % "1.9.0" % "test"
  //"ch.qos.logback" % "logback-classic" % "1.1.2",
  //"com.typesafe" %% "scalalogging-slf4j" % "1.1.0",
  //"org.scalatest" %% "scalatest" % "2.1.3",
  //"org.seleniumhq.selenium" % "selenium-java" % "2.41.0",
  //"com.google.code.findbugs" % "jsr305" % "2.0.3"
)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:reflectiveCalls")


