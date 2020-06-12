package com.Learning.Scala

import scala.io.Source

object FindingListDuplicates {
  def main(args: Array[String])
  {
    val Inputfile = Source.fromFile("Payor.csv").getLines().drop(1).toList
    val Duplicates = Inputfile.diff(Inputfile.distinct)
    Duplicates.foreach(println)

  }

}
