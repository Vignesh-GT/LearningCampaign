package com.Learning.Scala

import scala.io.Source

object PayorFindDuplicates {

  def main(args:Array[String]): Unit = {

    val PayorList = Source.fromFile("Payor.csv").getLines().drop(1).toList

    val PayorDup = PayorList.groupBy(identity).collect { case (x, List(_,_,_*)) => x }

    println(PayorDup)

  }

}
