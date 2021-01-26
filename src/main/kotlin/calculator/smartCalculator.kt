package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var arrNum: List<Int>
    var str: String
    while (true) {
        str = scanner.nextLine()

        when {
            ("/exit".equals(str)) -> {
                println("Bye!")
                break
            }
            (str.isBlank()) -> continue
            else -> {
                arrNum = str.split(" ").map { it.toInt() }

                var sum = 0
                for (cur in arrNum)
                    sum += cur
                println(sum)
            }
        }
    }
}
