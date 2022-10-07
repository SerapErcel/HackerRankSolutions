import kotlin.io.*
import kotlin.math.min
import kotlin.text.*

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    val front = p / 2
    val back = if (n % 2 == 0) (n - p + 1) / 2 else (n - p) / 2

    return min(front, back)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
