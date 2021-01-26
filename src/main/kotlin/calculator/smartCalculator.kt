package calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val arrNum = scanner.nextLine().split(" ").map { it.toInt() }

    var sum = 0
    for (cur in arrNum)
        sum += cur

    println(sum)
}
