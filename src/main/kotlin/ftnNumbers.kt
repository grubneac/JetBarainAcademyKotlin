import java.util.*
/*
Write a program that reads an integer number and prints one of the letters below:

"F" if the number is 0, 1, 2, 3, 5, 8, 13, 21, 34, 55 (Fibonacci numbers)
"T" if the number is 0, 1, 3, 6, 10, 15, 21, 28, 36, 45 (Triangle numbers)
"P" if the power of 10: 1, 10, 100, 1000, 10000, 100000 (powers of ten)
"N", otherwise.
The order is important! You do not need to consider other numbers as suitable
(e.g., 89 is a Fibonacci number, but the program must print "N" because it does not belong to the given subsequence).
*/
fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextInt()

    val f = arrayOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val t = arrayOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val n = arrayOf(1, 10, 100, 1_000, 10_000, 100_000)

    when {
        f.contains(str) -> println("F")
        t.contains(str) -> println("T")
        n.contains(str) -> println("P")
        else -> println("N")
    }
}