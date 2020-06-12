package com.Learning.Scala

import scala.io.Source

object RemovingListDuplicates {
  def main (args: Array[String])
  {

    val Inputfile = Source.fromFile("Payor.csv").getLines().drop(1).toList
    val DistinctValues = Inputfile.toSet
    DistinctValues.foreach(println)

  }

}
