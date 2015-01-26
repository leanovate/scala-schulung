package part06.implicits

import java.text.SimpleDateFormat
import java.util.Date

object Implicits {
  import scala.languageFeature.implicitConversions
  def toDate(s: String): Date = new SimpleDateFormat("yyyy-MM-dd").parse(s)

  class DateAwareString(s: String) {
    def toDate: Date = new SimpleDateFormat("yyyy-MM-dd").parse(s)
  }
}
