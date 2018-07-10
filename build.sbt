name := "its-helloakkahttp"

version := "0.1.0"

organization := "com.its"

scalaVersion := "2.12.4"

libraryDependencies ++= {
  val akkaHttpVersion = "10.1.3"
  Seq(
    "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream"          % "2.5.12"
  )
}
