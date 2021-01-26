fun main() {
println(f(arrayOf(1,2,3,4,8,6,7),0, 6))
}

//return count of even numbers
fun f(array: Array<Int>, left: Int, right: Int): Int {
    return if (left == right) {
        if (array[left] % 2 == 0) {
            1
        } else {
            0
        }
    } else {
        val middle = (left + right) / 2
        f(array, left, middle) + f(array, middle + 1, right)
    }
}