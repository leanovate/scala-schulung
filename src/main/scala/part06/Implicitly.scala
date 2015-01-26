package part06

object Implicitly {
  def multiply(a: Int)(b: Int) = a * b

  def main(): Unit = {
    val b = 5
    val result: Int = multiply(5)(b)
  }
}
