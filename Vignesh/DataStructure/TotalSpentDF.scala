package com.Learning.Scala

import org.apache.spark.sql._
import org.apache.log4j._
import org.apache.spark.sql.functions._

object TotalSpentDF {

    def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.ERROR)

    val sparksession = SparkSession
      .builder()
      .appName("TotalSpent")
      .master("local")
      .getOrCreate()


    val file = sparksession.sqlContext.read.option("header",true)
      .csv("CustomerSpentDetails.csv")
      .withColumn("AmountSpent", col("Amount").cast("Float"))
      .cache()
    file.printSchema()


    file.groupBy(file("CustomerID")).agg(sum(file("AmountSpent")))
      .sort(asc("CustomerID"))
      .show(20)


  }

}