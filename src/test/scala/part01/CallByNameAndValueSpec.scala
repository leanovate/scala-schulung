package part01

import org.specs2.mutable._
import org.specs2.specification.Scope

class CallByNameAndValueSpec extends Specification {
  "CallByNameAndValue" should {
    "run fast when first parameter is even" in new CallByNameAndValueScope {
      val start = System.nanoTime()
      o.areBothOdd(2, someStrangeY)
      System.nanoTime() - start must not beGreaterThan oneSecondInNanos
    }
  }

  trait CallByNameAndValueScope extends Scope {
    val o = new CallByNameAndValue()
    def someStrangeY: Int = {
      Thread.sleep(1000)
      5
    }
    val oneSecondInNanos = 1000L * 1000L * 1000L
  }
}
