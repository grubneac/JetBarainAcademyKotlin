import java.util.*
/*
There is a sequence of integer numbers (which ends with the number 0). Find the largest element of this sequence.

The number 0 itself is not included in the sequence. It serves only as a sign that there are no more numbers.
*/
fun main() {
    val scanner = Scanner(System.`in`)
    var num: Int
    var maxInt = Int.MIN_VALUE
    while (scanner.hasNextInt()) {
        num = scanner.nextInt()
        when {
            num == 0 -> break
            num > maxInt -> maxInt = num
        }
    }
    println(maxInt)
}