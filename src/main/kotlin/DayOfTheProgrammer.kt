import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int) = when {
    year == 1918 -> "26.09.$year"
    (year <= 1917 && year % 4 == 0) || (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) -> "12.09.$year"
    else -> "13.09.$year"
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
