package com.Learning.Scala

object FindEmptyString {

  def main(args:Array[String]): Unit = {

    def isBlank(a: String): Unit =
    {
      if (a.trim() == "")
        println(true)

      else if (a == null)
        println(true)

      else
        println(false)
    }

    val Physician = List("Thiyaga","Vignesh","   ","Abin",null)

    val Physiciannew = Physician.map(isBlank)

    println(Physiciannew)

  }

}
