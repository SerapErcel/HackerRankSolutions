import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    // Write your code here
    var count = 0
    for (i in s.indices) {
        var sum = 0
        for (j in 0 until m) {
            if (i + j < s.size) {
                sum += s[i + j]
            }
        }
        if (sum == d) {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val d = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}