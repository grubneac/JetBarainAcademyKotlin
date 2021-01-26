package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var arrNum: List<String>
    var str: String
    while (true) {
        str = scanner.nextLine()

        when {
            ("/exit".equals(str)) -> {
                println("Bye!")
                break
            }
            ("/help".equals(str)) -> println(
                "The program must calculate expressions like these:" +
                        " 4 + 6 - 8, 2 - 3 - 4, and so on. It must support both unary and binary minus operators. " +
                        "If the user has entered several same operators following each other, the program still " +
                        "should work (like Java or Python REPL).\n" +
                        "\n" +
                        "Consider that the even number of minuses gives a plus, and the odd number of minuses gives " +
                        "a minus! Look at it this way: 2 -- 2 equals 2 - (-2) equals 2 + 2."
            )
            (str.isBlank()) -> continue
            else -> {
                arrNum = str.split(" ")

                var sum = 0
                var plusMinus = true
                for (cur in arrNum) {
                    when {
                        (isNum(cur)) -> {
                            if (plusMinus) sum += cur.toInt()
                            else sum -= cur.toInt()
                        }
                        (cur.isBlank()) -> continue
                        else -> plusMinus = getSign(cur)
                    }
                }
                println(sum)
            }
        }
    }
}

fun getSign(str: String): Boolean {
    val charArr = str.toCharArray()
    var flag = true
    for (ch in charArr) {
        if (ch == '-') flag = !flag
    }
    return flag
}

fun isNum(cur: String): Boolean {
    return try {
        cur.toInt()
        true
    } catch (e: Exception) {
        false
    }
}
