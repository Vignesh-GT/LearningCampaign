package com.Learning.Scala

object Collections {
  def main(args: Array[String]): Unit = {

    //Immutable Map
    val IM = Map(1->"Vignesh",2->"Thiyaga",3->"Abin")
    val IM1 = Map(4->"Santhosh")
    print("Result is:\n"+IM(3)+"\n")

    val IMResult = IM.foreach(x => println(x))
    IM.keys.foreach(println)
    IM.values.foreach(println)

    val IMAdd = IM ++ IM1
    IMAdd.foreach(x => println(x))

    //Updating Immutable Map
    val IMUpdate = IM.updated(1, "Viggie")
    IMUpdate.foreach(x => println(x))

    //Mutable Map

    var states = scala.collection.mutable.Map[String,String]()
    states("TN") = ("TamilNadu")
    states.foreach(x => println(x))

    //Adding more values to mutable map
    states("MI") = ("Mumbai")
    states.foreach(x => println(x))

    states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
    states.foreach(x => println(x))

    //Removing values
    states -= "AR"
    states.foreach(x => println(x))

    //Tuples
    val TupleDetail = ("Tuple",23)
    TupleDetail.getClass()
    println(TupleDetail._1)
    println(TupleDetail._2)

    def EmpDetail = ("Vignesh",29,84.5)
    val(name, age, weight) = EmpDetail
    println(s"My Name: $name"+s"\nAge: $age"+s"\nWeight: $weight")

    //Lists
    val a = List(1,2,3)
    val b = List(3,4,5)
    val c = List.concat(a,b)
    c.foreach{println}

    //sum all elements
    var listsum = 0
    c.foreach(listsum += _)
    println(listsum)

    var names = List("Abin","Thiyaga","Vignesh")
    for (name <- names if name.startsWith("A"))
      println(name)

    //Filter in List
    val evens = c.filter(a => a % 2 == 0)
    println(evens)

    //Map in list
    val listmap = c.map(a => a * 2)
    println(listmap)
    val lower = names.map(_.toLowerCase)
    println(lower)
    val upper = names.map(_.toUpperCase)
    println(upper)

    //Sorting
    val listsort = c.sortWith(_ > _)
    println(listsort)

    //varargs function
    // Calling the function
    println("Sum is: " + sum(5, 3, 1000, 2000, 3000));

  }

  // declaration and definition of function
  def sum(a :Int, b :Int, args: Int *) : Int =
  {
    var result = a + b

    for(arg <- args)
    {
      result += arg
    }

    return result
  }
}

