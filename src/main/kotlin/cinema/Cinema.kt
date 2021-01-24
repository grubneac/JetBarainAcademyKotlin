package cinema

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the number of rows:")
    val rows = scanner.nextInt()

    println("Enter the number of seats in each row:")
    val seats = scanner.nextInt()

    val screenRoom = Array(rows) { CharArray(seats) }
    fillScreenRoom(screenRoom)

    var flag = true
    while (flag) {
        when (getChooseMenu(scanner)) {
            1 -> showScreenRoom(screenRoom)
            2 -> byTicket(scanner, screenRoom)
            3 -> statistics(screenRoom)
            else -> flag = false
        }
    }
}

fun statistics( sr: Array<CharArray>) {
    println()
    val purchasedPlaces = getQuantityPurchasedPlaces(sr)
    println("Number of purchased tickets: $purchasedPlaces")

    val totalPlaces = sr.size * sr[0].size
    println(String.format("Percentage: %.2f", purchasedPlaces.toDouble() / totalPlaces * 100) + "%")

    val currIncome = getCurrentIncome(sr)
    println("Current income: \$$currIncome")
    val totalIncome = getTotalIncome(sr)
    println("Total income: \$$totalIncome")
}

fun getTotalIncome(sr: Array<CharArray>): Int {
    var income = 0
    for (i in sr.indices)
        for (j in sr[i].indices) {
                income += priceSeats(i+1, sr)
        }
    return income
}

fun getCurrentIncome(sr: Array<CharArray>): Int {
    var income = 0
    for (i in sr.indices)
        for (j in sr[i].indices) {
            if (sr[i][j] == 'B') {
                income += priceSeats(i+1, sr)
            }
        }
    return income
}

fun priceSeats(row: Int, sr: Array<CharArray>): Int {
    val rows = sr.size
    val seats = sr[0].size
    return if (rows * seats <= 60) {
        10
    } else {
        if (rows / 2 < row) {
            8
        } else {
            10
        }
    }
}

fun getQuantityPurchasedPlaces(sr: Array<CharArray>): Int {
    var counter = 0
    for (row in sr)
        for (chair in row) {
            if (chair == 'B') {
                counter++
            }
        }
    return counter
}

fun getChooseMenu(scanner: Scanner): Int {
    println()
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
    return scanner.nextInt()
}

private fun byTicket(scanner: Scanner, sr: Array<CharArray>) {

    var flag = true
    while (flag) {
        println()
        println("Enter a row number:")
        val row = scanner.nextInt()

        println("Enter a seat number in that row:")
        val col = scanner.nextInt()
        println()

        when {
            row > sr.size || col > sr[0].size -> println("Wrong input!")
            sr[row - 1][col - 1] == 'S' -> {
                sr[row - 1][col - 1] = 'B'
                val ticketPrice = priceSeats(row , sr)
                println("Ticket price: \$$ticketPrice")
                flag = false
            }
            else -> println("That ticket has already been purchased!")
        }
    }
}

private fun fillScreenRoom(screenRoom: Array<CharArray>) {
    for (i in screenRoom.indices)
        for (j in screenRoom[i].indices)
            screenRoom[i][j] = 'S'
}

private fun showScreenRoom(sr: Array<CharArray>) {
    println()
    print("Cinema:\n ")
    for (i in sr[0].indices) print(" ${i + 1}")
    println()

    for (i in sr.indices) {
        print(i + 1)
        for (j in sr[i].indices) {
            print(" ${sr[i][j]}")
        }
        println()
    }
    println()
}