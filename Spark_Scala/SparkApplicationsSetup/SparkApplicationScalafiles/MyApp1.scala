package main.scala

object MyApp1 {
  def main(args: Array[String]) {
    println("hello")
    val x = "welcome guys"
    val y = x.map(_.toUpper)
    y.foreach(println)
}}