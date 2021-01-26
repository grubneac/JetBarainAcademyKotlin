import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (a + b > c && a + c > b && b + c > a) "YES" else "NO")
}