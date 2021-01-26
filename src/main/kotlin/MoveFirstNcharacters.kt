import java.util.*
/*
Write a program that reads a string s and an int n, and then moves the first n characters of s to the end of
 the string. The program must output the changed string. If n is greater than the length of the string,
 it must output the string unchanged.

Note, the substring() method can help you, but you may choose another way to solve the problem.

The single input line contains s and n separated by a space.
*/
fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    val n: Int = scanner.nextInt()
    if (str.length >= n) {
        println(str.substring(n) + str.substring(0, n))
    } else {
        println(str)
    }
}