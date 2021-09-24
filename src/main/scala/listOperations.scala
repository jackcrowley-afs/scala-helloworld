package com.organization

object listOperations extends App {

  val list1 = Seq(1,2,3,4)
  val list2 = Seq(4,5,6,7)

  println(list1)

  var listAdd = list1 ++ list2
  println(listAdd)

  //Append 8.

  listAdd = listAdd :+ 8
  println(listAdd)


  val valInCommon = list1.filter(x => list2.contains(x)).sum

  println(valInCommon)

  val list3 = Seq(5,6,7,8)

  val noValInCommon = !list1.filter(x => list3.contains(x)).isEmpty
  println(noValInCommon)

}
