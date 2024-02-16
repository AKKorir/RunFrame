name := """mainfrane"""
organization := "com.mafia"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)



scalaVersion := "2.13.12"

libraryDependencies += guice

playEbeanVersion :="6.2.0-RC4"
