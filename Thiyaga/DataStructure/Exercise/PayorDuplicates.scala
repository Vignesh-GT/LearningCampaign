package com.Learning.Scala

import scala.io.Source

object PayorDuplicates {

def main(args:Array[String]): Unit = {

  val PayorList = Source.fromFile("Payor.csv").getLines().drop(1).toList

  val PayorUnique = PayorList.toSet

  println (PayorList)

  println(PayorUnique)


}


}
