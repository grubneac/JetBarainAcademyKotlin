import java.util.*
/*
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the repetition is equal to the
number itself). The input of the program is a positive integer n – the number of the elements of the sequence the
program should print. As the output, the sequence of numbers, written in a single line, space-separated, is expected.

For example, if n = 7, the program is to output 1 2 2 3 3 3 4.
*/
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    var counter = 0
    loop@ for (i in 1..a) {
        for(j in 1..i) {
            print("$i ")
            counter++
            if (counter >= a) break@loop
        }
    }
}
