package part01

import org.specs2.mutable._

class GreeterSpec extends Specification {
  "Greeter" should {
    """say "Hello World!"""" in {
      Greeter.greetingInEnglish mustEqual "Hello World!"
    }
    """say "Hallo Welt!"""" in {
      Greeter.greetingInGerman mustEqual "Hallo Welt!"
    }
    """say "Ciao Mondo!"""" in {
      Greeter.greetingInItalian mustEqual "Ciao Mondo!"
    }
  }
}
