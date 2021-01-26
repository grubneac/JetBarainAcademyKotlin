import java.lang.Exception
/*
Imagine you implement a web service to pay for video games. There is a text field where a user inputs
their card number. A card number is a string like "AAAA AAAA AAAA AAAA", where A is any digit.
Please note that a correct card number contains three spaces as in the template.
Create a function that returns the card number as a Long or produces any exception when the card number is incorrect.
*/
fun main() {
    val str = readLine()!!
    println(parseCardNumber(str))
}

fun parseCardNumber(cardNumber: String): Long {
    var result: Long = 0L
    val regex = """\d{4}\s\d{4}\s\d{4}\s\d{4}""".toRegex()
    if (regex.matches(cardNumber)) {
        result = cardNumber.replace(" ", "").toLong()
    } else {
        throw Exception("card number is incorrect")
    }

    return result
}