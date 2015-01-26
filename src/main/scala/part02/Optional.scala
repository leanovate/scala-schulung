package part02

import scala.annotation.tailrec

object Optional {

  def factorial(n: Int): Option[Int] = {

    @tailrec
    def fac(n: Int, acc: Int): Int = if (n == 0) acc else fac(n - 1, acc * n)

    if (n < 0) None
    else Some(fac(n, 1))
  }

  def findPersonByName(lastName: String, firstName: Option[String] = None) = ???


}

