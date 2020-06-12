package com.Learning.Scala

import scala.io.Source

class EmptyStringIdentifier {
  def IsBlank(Input: String): Boolean =
  {
    if (Input.trim.isEmpty() || Input.equals(null))
       true
    else false

  }
}

object Main extends EmptyStringIdentifier {
  def main(args: Array[String]) = {
    val Inputfile = Source.fromFile("Payor.csv").getLines().drop(1).toList

    for (i <- Inputfile)
      println("The boolean value of " + i + " is: " + IsBlank(i))
  }
}