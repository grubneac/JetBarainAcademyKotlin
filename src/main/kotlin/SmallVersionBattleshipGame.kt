import java.util.*

/*
Let's try to build a small version of the Battleship game. There is a field with 5 rows (X) and 5 columns (Y),
25 cells in total.
Write a program that reads coordinates (X, Y) of three one-cell-sized ships and prints all the available rows (X) and
columns (Y) for new ships. It means that new ships can be placed only in rows and columns which are vacant.

All the input coordinates are separated with space. Separate the output in the same way. Print rows (X) and columns (Y)
in two different rows. Do not add unnecessary spaces at the end of output lines.
*/

fun main() {
    val scanner = Scanner(System.`in`)
    val ship1 = scanner.nextLine()!!.split(" ").map { it.toInt() }
    val ship2 = scanner.nextLine()!!.split(" ").map { it.toInt() }
    val ship3 = scanner.nextLine()!!.split(" ").map { it.toInt() }

    val squadron = arrayOf(ship1, ship2, ship3)

    var flag: Boolean
    var outputStr = ""
    for (i in 1..5) {
        flag = true
        for (ship in squadron) {
            if (i == ship[0]) {
                flag = false
            }
        }
        if (flag) outputStr += "$i "
    }
    println(outputStr.trim())
    outputStr = ""
    for (i in 1..5) {
        flag = true
        for (ship in squadron) {
            if (i == ship[1]) {
                flag = false
            }
        }
        if (flag) outputStr += "$i "
    }
    println(outputStr.trim())
}