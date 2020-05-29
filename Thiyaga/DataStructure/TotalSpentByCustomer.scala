package com.Learning.Scala

import org.apache.log4j._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._

object TotalSpentByCustomer {

  def main(args:Array[String]) {

    Logger.getLogger("org").setLevel(Level.ERROR)

    val sparksession = SparkSession
      .builder()
      .appName("TotalSpentByCustomer")
      .master("local")
      .getOrCreate()

    val inputFile = sparksession.sqlContext.read.option("header", true)
      .csv("CustomerSpentDetails.csv")
      .withColumn("TotalAmountSpent", col("Amount").cast("Float"))
      .cache()

    //TODO: Calculating total spent for each customer
    inputFile.groupBy("CustomerID").agg(sum("TotalAmountSpent"))
      .sort(desc("CustomerID"))
      .show(100)
  }

}