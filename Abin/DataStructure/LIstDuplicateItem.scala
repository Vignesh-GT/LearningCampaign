package com.Learning.Scala

object LIstDuplicateItem {

  def main(args: Array[String]){

    val dup = List(1,1,1,2,3,4,5,5,6,100,101,101,102)

    val ItemDuplicates= dup.diff(dup.distinct).distinct

    ItemDuplicates.foreach(println)
  }
}
