package com.Learning.Scala

object Collections {
  def main(args:Array[String])
  {
    val listval = List("Viggie","Thiyaga","Prem","Abin","Subha")
    println(listval)
    
    println(listval(0))
    
    //head and tail
    println(listval.head)
    println(listval.tail)
    
    //Iteration
    for(listfor <- listval) {println(listfor)}
    listval.foreach(println)
    
    
    //reduce
    val numberList = List(1, 2, 3, 4, 5)              //> numberList  : List[Int] = List(1, 2, 3, 4, 5)
    val sum = numberList.reduce( (x: Int, y: Int) => x + y)
    val sum1 = numberList.reduce(_ + _)
                                                  //> sum  : Int = 15
    println(sum)  
    println(sum1) //> 15
    
    //filter
    val iHateFives = numberList.filter( (x: Int) => x != 5)
    println(iHateFives)
                                                 
    val iHateThrees = numberList.filter(_ != 3)
    println(iHateThrees)
    
    //Concatenating Lists
    val moreNumbers = List(6, 7, 8)
    val lotsOfNumbers = numberList ++ moreNumbers
    println(lotsOfNumbers)
    
    //Map Fun
    val numbers = List(1, 2, 3, 4)
    val numMul = numbers.map((i: Int) => i * 2)
    val numforeach = numbers.foreach((i: Int) => i * 2)
    println("List Map"+numMul)
    println("ForEach Check:"+numforeach)


    val listOfAdd = List(2,4,5)
    def timesTwo(i: Int): Int = i * 2
    val mapres = listOfAdd.map(timesTwo)
    println(mapres)
    
    //fill
    val listfill = List.fill(3)("apples")
    println(listfill)
    
    val listfillint = List.fill(2)(5)
    println(listfillint)
    
    //Tabulating List
    val listsquares = List.tabulate(6)(n => n * n)
    println("Squares"+listsquares)
    
    val listmul = List.tabulate(2,3) (_ * _)
    println("Multiply" + listmul)
   
    
    // More list fun
    val reversed = numberList.reverse                 //> reversed  : List[Int] = List(5, 4, 3, 2, 1)
    val sorted = reversed.sorted                      //> sorted  : List[Int] = List(1, 2, 3, 4, 5)
    val lotsOfDuplicates = numberList ++ numberList   //> lotsOfDuplicates  : List[Int] = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val distinctValues = lotsOfDuplicates.distinct    //> distinctValues  : List[Int] = List(1, 2, 3, 4, 5)
    val maxValue = numberList.max                     //> maxValue  : Int = 5
    val total = numberList.sum                        //> total  : Int = 15
    val hasThree = iHateThrees.contains(3)            //> hasThree  : Boolean = false
    
    
    //Sets
    
    
    //Maps
      var Mapval :Map[Char,Int] = Map()
        Mapval.+=('I' -> 1)
        Mapval.+=('J' -> 5)
        Mapval.+=('K' -> 10)
        Mapval.+=('L' -> 100)
         println(Mapval)
         
    val shipMap  = Map(1 -> "Enterprise",
    2 -> "Enterprise",
    3 -> "Deep Space Nine",
    4 -> "Voyager")
    
    println(shipMap(4))
    
    println(shipMap.contains(5))
    
    val archersShip = util.Try(shipMap(6)) //getOrElse (shipMap(1))
                                                  //> archersShip  : String = Unknown
    println(archersShip)
    
    val archershipget = shipMap.get(3)
    println(archershipget)
    
    val archerempty = shipMap.empty
    println(archerempty)
    
    //shipMap.clear()
    
    
    //Tuples
    
    
    
    //Options
    val learningopt = Map(1 -> "Viggie",2 -> "Thiyaga")
    println("Key 1:" + learningopt.get(1))
    println("Key unknown:" + learningopt.get(3))
    
    
    
    //Iterator
    val Iteratorval = Iterator("Viggie","Thiyaga","Prem","Abin","Subha")
    Iteratorval foreach println
    
    
    println(Iteratorval.hasNext)
    while(Iteratorval.hasNext)
    {
      println(Iteratorval.next())
    }
    

  
  }
}
  
