import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`) // reads data

//    val line1 = readLine()!!
//    val line2 = readLine()!!
//    val line3 = readLine()!!
//    val line4 = readLine()!!
//    val line5 = readLine()!!
//    println("$line1 $line2 $line3 $line4 $line5")
//    val f: Float = 20.0.toFloat() + 20.02f // 1
//    val l: Long = 10 + 2L        // 2
//    val n: Int = l.toInt() + 5           // 3

//    val magic = 2_000_000_000
//    val giant = 3_000_000_000
//
//    val x:Long = magic + magic.toLong() + 1
//    println(x)


//
//    val lineInt: Int = readLine()!!.toInt()
//    println(lineInt)
//
//
//    val num1 = scanner.nextInt() // reads the first number
//    val num2 = scanner.nextInt() // reads the second number
//
//    println(num2) // prints the second number
//    println(num1) // prints the first number

//    val counter = 5
//    val arr = Array(counter) { scanner.next() }
//
//    for (i in 0 until counter)
//        println(arr[i])
//    val i = 101
//    val d = 3.1415
//    val s = "32"
//
//   println(i.toDouble())
//   println(d.toString())
//   println(d.toLong())
//   println(s.toInt())
//    println(scanner.nextDouble().toLong())

//    val arr = Array<Int>(3) { scanner.nextInt()!! }
//    for (i in arr.indices) {
//        if (arr[i] % 2 != 0) {
//            arr[i] = (arr[i] + 1) / 2
//        } else {
//            arr[i] = arr[i] / 2
//        }
//    }
//
//    println(arr[0] + arr[1] + arr[2])

//    println(scanner.nextInt()!!.toInt() < 10)

//    val a = scanner.nextInt()
//    val b = scanner.nextInt()
//    val c = scanner.nextInt()
//
//    println(a > 0 && b < 1 && c < 1 || a < 1 && b > 0 && c < 1 || a < 1 && b < 1 && c > 0)

//    println('\u0040')
//
//    val one = '1'
//
//    println(one.isDigit())
//    println(one.isUpperCase())
//    println(one.isLowerCase())

//    val a: Char = scanner.next().first()
//    val b: Char = scanner.next().first()
//    val c: Char = scanner.next().first()
//    val d: Char = scanner.next().first()
//
//    println(
//        a.isDigit().toString() +
//        "\\" + b.isDigit().toString() +
//        "\\" + c.isDigit().toString() +
//        "\\" + d.isDigit().toString())

//    val a = scanner.nextInt()
//    val arrInt = IntArray(a)
//    var maxInt: Int
//    var currInt: Int
//
//    for (i in 0 until a) {
//        arrInt[i] = scanner.nextInt()
//    }
//    maxInt = arrInt[0]
//
//    for (i in 0 until a) {
//        val k = i + 1
//        if (k <= a - 1) {
//            for (j in k until a) {
//                currInt = arrInt[i] * arrInt[j]
//                if (currInt > maxInt) {
//                    maxInt = currInt
//                }
//            }
//        }
//
//    }
//    println(maxInt)

//    var n: Int
//    var sumInt = 0
//    do {
//        n = scanner.nextInt()
//        sumInt += n
//    } while (n > 0)
//
//    println(sumInt)
//    var n: Int
//    var position = 1
//    var maxInt = Int.MIN_VALUE
//    var curPos = 0
//    while (scanner.hasNextInt()) {
//        n = scanner.nextInt()
//        curPos++
//        if (n > maxInt) {
//            maxInt = n
//            position = curPos
//        }
//    }
//
//    println("$maxInt $position")

//    println(if(scanner.nextInt()%2 == 0)  "EVEN" else "ODD" )

//    val counter = scanner.nextInt()
//    val arr = IntArray(counter)
//
//    for (idx in arr.indices) {
//        arr[idx] = scanner.nextInt()
//    }
//    var maxInt = Int.MIN_VALUE
//    var index = 0
//    for (idx in arr.indices) {
//        if (arr[idx] > maxInt) {
//            maxInt = arr[idx]
//            index = idx
//        }
//    }
//    println(index)

//    val counter = scanner.nextInt()
//    val arr = IntArray(counter)
//    var maxIdx = 0
//    var maxTaxes = Int.MIN_VALUE
//    var currPrc = 0
//    var curTaxes = 0
//    for (idx in 0 until counter) {
//        arr[idx] = scanner.nextInt()
//    }
//    for (idx in 0 until counter) {
//        currPrc = scanner.nextInt()
//        curTaxes = arr[idx] * currPrc
//        if (curTaxes > maxTaxes) {
//            maxIdx = idx
//            maxTaxes = curTaxes
//        }
//    }
//    println(maxIdx + 1)

//    val counter = scanner.nextInt()
//    val arr = IntArray(counter)
//
//    for (idx in arr.indices) {
//        arr[idx] = scanner.nextInt()
//    }
//    var prevInt = arr[0]
//    for (idx in 1 until arr.size) {
//        if (arr[idx] < prevInt) {
//            println("NO")
//            return
//        }
//        prevInt = arr[idx]
//    }
//    println("YES")

//    val a = readLine()!!.toLong()
//    val b = readLine()!!.toLong()
//    println(divide(a, b))

//val c = 500000000000
//val d = 200000000000
//    println(divide(c, d))

    val tip = scanner.nextLine()

    println(
        when (tip) {
            "triangle" -> {
                val sideA = scanner.nextInt()
                val sideB = scanner.nextInt()
                val sideC = scanner.nextInt()
                val s = 0.5 * (sideA + sideB + sideC)
                kotlin.math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
            }
            "rectangle" -> {
                val sideA = scanner.nextInt()
                val sideB = scanner.nextInt()
                sideA * sideB
            }
            "circle" -> {
                val sideA = scanner.nextInt()
                sideA * sideA * 3.14
            }
            else -> "Do not know this shape"
        }
    )
}
fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int) = number1 + number2 > number3 + number4

fun isRightEquation(a: Int, b: Int, c: Int) = a * b == c

fun divide(a: Long, b: Long):Double {
    return a.toDouble() / b
}
