package com.organization

object GroupBy extends App{

  case class Value(rating: Int,
                   price: Double)

  case class Name(first: String,
                  last: String)
  case class Book(title: String,
                  numberOfPages: Int,
                  genre: String,
                  author: Name,
                  coAuthors: Seq[Name], value: Value = Value(3,14.99))


  val cith = Book("Cat in the Hat", 20, "Children", Name("Dr.", "Seuss"), Seq.empty[Name])
  val tgt = Book("The Giving Tree", 30, "Children", Name("Shel", "Silverstein"), Seq(Name("Bob", "Vance"), Name("Chris", "Evert")))
  val tdc = Book("The DaVinci Code", 350, "Mystery", Name("Dan", "Brown"), Seq.empty[Name])

  val sis = Book("A Study in Scarlet", 250, "Mystery", Name("Conan" ,"Doyle"), Seq.empty[Name])

  val bookList = Seq(cith, tgt, tdc, sis)

  val groupedList = bookList.groupBy(_.genre)

  println(groupedList)

  val filteredList = bookList.filter(x => !x.coAuthors.isEmpty)
  println(filteredList)

  //Double Mapping.  Map Once for the Authors, Map Twice again for the co-authors.
  val authorsList1 = bookList.map(x => x.author) ++ bookList.flatMap(x => x.coAuthors)

  println(authorsList1)

  val authorsList2 = bookList.flatMap(x => x.coAuthors.+:(x.author))

  println(authorsList2)
}

