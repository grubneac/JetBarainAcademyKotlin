import java.util.*

/*
Write a program that finds the frequency of occurrences of substring in given string.

The first input line contains a string, the second one contains a substring.
*/

fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()
    val subStr = scanner.nextLine()

    var idx = -1
    var counter = 0
    while (true) {
        idx = str.indexOf(subStr, idx + 1)
        if (idx != -1) counter++
        else break
    }
    println(counter)
}