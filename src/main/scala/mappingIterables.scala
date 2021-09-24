package com.organization

object mappingIterables extends App{

  case class Food(name:String,
                  weightInOunces: Int,
                  pairedWine: Option[String])

  val steak = Food("steak", 8, Some("merlot"))
  val fish = Food("fish", 6, Some("pinot"))
  val bacon = Food("bacon", 4, None)


  //A.  Create your own instance of a food object.  Give nothing for paired wine.

  val turkey = Food("turkey", 5, None)

  val foodList = Seq(steak,fish,bacon,turkey)

  val weightList = foodList.map(x => x.weightInOunces)
  println(weightList)

  val wineList = foodList.filter(x => !x.pairedWine.isEmpty).map(x => x.pairedWine.getOrElse("X"))
  println(wineList)

  val weightSum = foodList.map(x => x.weightInOunces).sum
  println(weightSum)

  var steakCopy = steak.copy(pairedWine = Option("cabernet"))
  println(steakCopy)

  var foodListCabernet = foodList.map(x => x.copy(pairedWine = Option("cabernet")))
  println(foodListCabernet)

  val foodListAddedWeight = foodList.map(x => x.copy(weightInOunces = x.weightInOunces + 10))
  println(foodListAddedWeight)

  val foodGreaterThanNames = foodList.filter(x => x.weightInOunces > 6).map(x => x.name)
  println(foodGreaterThanNames)

  val foodsWithWines = foodList.filter(x => !x.pairedWine.isEmpty).map(x => x.name)
  println(foodsWithWines)
}
