import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val list1 = scanner.nextLine().split(" ")
    val list2 = scanner.nextLine().split(" ")

    println((list1 + list2).joinToString())
}