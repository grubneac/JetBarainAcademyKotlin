fun main() {
    println(f(arrayOf(1, 2, 3, 4, 5), 0, 4, 5))

    println(f(arrayOf(1, 2, 3, 5, 5), 0, 5, 5))

    println(f(arrayOf(2, 2, 2, 2, 20), 0, 4, 2))

    println(f(arrayOf(1, 2, 3, 3, 3), 0, 4, 3))

    println(f(arrayOf(1, 1, 1, 2, 2), 1, 3, 1))
}

fun f(array: Array<Int>, left: Int, right: Int, value: Int): Int {
    if (left >= right) {
        return 0
    } else {
        if (left == right - 1) {
            if (array[left] == value) {
                return 1
            } else {
                return 0
            }
        } else {
            val middle = (left + right) / 2
            return f(array, left, middle, value) + f(array, middle, right, value)
        }
    }
}