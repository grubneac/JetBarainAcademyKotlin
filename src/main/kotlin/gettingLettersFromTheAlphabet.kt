import java.util.*

/*
Write a program that reads a letter and prints all the letters of the English alphabet that precede the given one.

You can easily solve this task without returns but we advise you not to.
*/

fun main() {
    val scanner = Scanner(System.`in`)
    val ch: Char = scanner.nextLine().first()

    for (cur in 'a'..'z') {
        if (cur == ch) break
        print(cur)
    }
}