package part05

import scala.concurrent.Future
import scala.util.Random

object BackToTheFuture {
    case class Pasta(msg: String)
    case class BoiledPasta(msg: String)
    case class Sauce(name: String)
    case class SpaghettiBolognese(msg: String)
    case class Water(temperature: Int)

    def boilWater(water: Water): Future[Water] = Future {
      println("preparing to boil " + water)
      Thread.sleep(Random.nextInt(2000))
      println("water is boiled")
      water.copy(temperature = 90)
    }

    def cookPasta(pasta: Pasta, water: Water): Future[BoiledPasta] = Future {
      println(s"preparing to cook pasta $pasta with $water")
      Thread.sleep(Random.nextInt(2000))
      if (water.temperature < 70) throw new Exception("the water is not hot enough")
      println(s"$pasta is ready")
      BoiledPasta(s"$pasta ready")
    }

    def prepareSauce(ingredients: String*): Future[Sauce] = Future {
      println("preparing sauce with ingredients: " + ingredients.mkString(", "))
      Thread.sleep(Random.nextInt(2000))
      if (!ingredients.contains("tomatoes") || !ingredients.contains("beef")) {
        throw new Exception("cannot prepare bolognese without tomatoes and beef")
      }
      println("sauce is ready")
      Sauce("bolognese")
    }

    def mixPastaAndSauce(boiledPasta: BoiledPasta, sauce: Sauce): Future[SpaghettiBolognese] = Future {
      println(s"preparing to mix $boiledPasta with $sauce")
      Thread.sleep(Random.nextInt(1000))
      println(s"mix $boiledPasta with $sauce is ready")
      SpaghettiBolognese("spaghetti bolognese ready")
    }

    def prepareSpaghettiBolognese(pasta: Pasta, water: Water, ingredients: String*): Future[SpaghettiBolognese] = ???

}
