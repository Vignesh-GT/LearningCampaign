package com.Learning.Scala

import scala.collection.immutable._

object DuplicateInSet {

    def main(args: Array[String]) {

      val dup = List(1,1,1,2,3,4,5,5,6,100,101,101,102)

      val listSet = dup.toSet

      println(listSet)
    }

}
