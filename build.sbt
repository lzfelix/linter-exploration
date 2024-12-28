scalaVersion := "2.13.13"

name := "todo"
version := "1.0"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
  "org.scalatest" %% "scalatest" % "3.2.19" % Test
)