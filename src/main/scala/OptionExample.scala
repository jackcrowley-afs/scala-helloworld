package com.organization

object OptionExample extends App {
  val x: Option[String] = None
  var y: Option[String] = Some("134")

  // add ABC to y

  val yString = y.map(_ + "")
  y.get + "ABC"

  println(yString)

  // provide a default value with "getOrElse"
  y.getOrElse("XXX")
  x.getOrElse("000")

  // add 11 to x
  x.map(_ + "11")
  val res4: Option[String] = None
}
