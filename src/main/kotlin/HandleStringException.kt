/*
Given a program that reads a number as an index and a string. Try to run it without any explicit checks first,
see if the corresponding exception is thrown for an incorrect string index, now fix the code to avoid it.
Keep in mind that you can check the index before trying to read array element so no exception would be thrown.

The corrected program should output There isn't such an element in the given string, please fix the index!
for incorrect string index access.
*/
fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    try {
        println(word[index])
    } catch (e: Exception) {
        println("There isn't such an element in the given string, please fix the index!")
    }
}