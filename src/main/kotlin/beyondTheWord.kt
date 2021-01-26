import java.util.*
/*
Write a program that reads a word and prints all the letters that aren't present in this word.

Only lowercase letters are counted.
*/
fun main() {
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()

    for (ch in 'a'..'z') {
        if (str.contains(ch)) continue
        print(ch)
    }
}