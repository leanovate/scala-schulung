package part04

import java.io.InputStream
import java.net.{HttpURLConnection, URLConnection, URL}

import scala.io.Source
import scala.util.Try

object Exceptional {

  case class Cigarettes()

  case class UnderAgeException(message: String) extends Exception(message)

  case class NoIdException(message: String) extends Exception(message)

  case class Customer(age: Int, haveId: Boolean = false) {
    // hint: you can use the require function
  }

  class Store {
    def buyCigarettes(customer: Customer): Cigarettes = ???
  }

  class GreedyStore extends Store {
    override def buyCigarettes(customer: Customer): Cigarettes = ???
  }

}

object Exceptional1 {

  def parseURL(url: String): Try[URL] = ???

  def getContent(url: URL): Iterator[String] = ???

  def toHttp(connection: URLConnection): Option[HttpURLConnection] = connection match {
    case http: HttpURLConnection if http.getResponseCode == 200 => Some(http)
    case _ => None
  }

  def inputStreamToIterator(is: InputStream) = Source.fromInputStream(is)
}
