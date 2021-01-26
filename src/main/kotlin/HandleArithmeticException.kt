import java.util.*

/*
Write a program that calculates the division of two input numbers. It may throw an ArithmeticException.
Fix it to avoid the exception.

In the case when the exception can happen, the corrected program should output: Division by zero,
please fix the second argument!.
*/
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    if (b == 0) {
        println("Division by zero, please fix the second argument!")
    }
    else {
        println(a / b)
    }
}