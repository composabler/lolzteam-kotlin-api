import kotlinx.coroutines.runBlocking
import me.topilov.LolzApi
import org.junit.Test
import java.text.DecimalFormat


//@Ignore
class Test {

   val TOKEN = System.getenv("TOKEN")
   val USER_ID = System.getenv("USER_ID").toInt()

   val api = LolzApi(TOKEN)

   var price = 0.0

   @Test
   fun test(): Unit = runBlocking {
      for (i in 501..1000) {
         price += 1000000000000.0
         println("""
  $i:
    price: ${DecimalFormat("#").format(price)}
    level: 7
    boosters:
      TREASURES: 1.25
      MONEY: 1.25
      BLOCKS: 1.25
      EXP: 1.25
         """.trimIndent())
      }
   }
}

fun Int.toRomanNumeral(): String = Symbol.closestBelow(this)
   .let { symbol ->
      if (symbol != null) {
         "$symbol${(this - symbol.decimalValue).toRomanNumeral()}"
      } else {
         ""
      }
   }

fun String.toDecimal() : Int {
   return Symbol.highestStartingSymbol(this)
      .let{symbol ->
         if (symbol != null) {
            symbol.decimalValue + this.drop(symbol.name.length).toDecimal()
         } else {
            0
         }
      }
}

private enum class Symbol(val decimalValue: Int) {
   I(1),
   IV(4),
   V(5),
   IX(9),
   X(10),
   XL(40),
   L(50),
   XC(90),
   C(100),
   CD(400),
   D(500),
   CM(900),
   M(1000);

   companion object {
      fun closestBelow(value: Int) =
         values()
            .sortedByDescending { it.decimalValue }
            .firstOrNull { value >= it.decimalValue }

      fun highestStartingSymbol(value: String) =
         values()
            .sortedByDescending { it.decimalValue }
            .firstOrNull { value.startsWith(it.name) }
   }
}