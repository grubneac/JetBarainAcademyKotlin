import java.util.*

/*
Paul loves to ride public transport and after receiving the ticket, he immediately checks whether he got the lucky one.
A ticket is considered a lucky one if the sum of the first three numbers in this ticket matches the sum of the last
three numbers in the same ticket.

However, Paul does not count well in his head. That is why he asks you to write the program, which will check
the equality of the sums and display "Lucky" if the sums match, and "Regular" if the sums differ.

A string of six digits is provided as input to the program.

You need to print out only the word "Lucky" or "Regular" with a capital letter (without quotes).
*/

fun main() {
    val scanner = Scanner(System.`in`)
    val arr = scanner.nextLine()!!.toCharArray().map { it -> it.toString().toInt() }

    println(if ((arr[0] + arr[1] + arr[2]) == (arr[3] + arr[4] + arr[5])) "Lucky" else "Regular")
}