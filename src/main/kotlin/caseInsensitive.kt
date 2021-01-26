import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val b = scanner.nextLine()
    val a = scanner.nextLine()
    println(a.equals(b, ignoreCase = true))
}