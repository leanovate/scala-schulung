package part03

import org.specs2.mutable.Specification

import ListsAndCo._

class ListsAndCoSpec extends Specification {
  "ListsAndCo" should {
    "return fibonacci number" in {
      fib(5) should_== 8
    }
    "return fibonacci list" in {
      fibList(6) mustEqual List(1, 1, 2, 3, 5, 8, 13)
    }
    "calculate a factorial number" in {
      fac(4) mustEqual 24
    }
    "calculate the sum of a list" in {
      sum(List(1, 2, 1, 3)) must equalTo(7)
    }
    "return last element of list" in {
      last(1 :: 2 :: 5 :: 10 :: Nil) must equalTo(10)
    }
    "return penultimate element of list" in {
      penultimate(1 :: 1 :: 2 :: 3 :: 5 :: Nil) mustEqual 3
    }
    "calculate length of a list" in {
      sizeOfList(List(0, 1, 2, 3)) mustEqual 4
    }
    "shout" in {
      shout(Array("Scala", "is", "fun")) mustEqual Array("SCALA", "IS", "FUN")
    }
    "concatenate" in {
      concatenate(Array("Scala", "is", "fun")) mustEqual "Scala is fun"
    }
    "shout" in {
      shout("Scala" :: "is" :: "fun" :: Nil) mustEqual List("SCALA", "IS", "FUN")
    }
    "extract words" in {
      extractWords(List("Scala is fun", "Java is sometimes fun", "PHP is crazy")) mustEqual
        List("Scala", "is", "fun", "Java", "is", "sometimes", "fun", "PHP", "is", "crazy")
    }
    "count words" in {
      countWords(
        List("Scala is fun", "Java is sometimes fun", "PHP is crazy")
      ) must havePairs(
        "Scala" -> 1, "is" -> 3, "fun" -> 2, "Java" -> 1, "PHP" -> 1,
        "sometimes" -> 1, "crazy" -> 1
      )

    }
  }
}
