import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'hurdleRace' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY height
 */

fun hurdleRace(k: Int, height: Array<Int>): Int {
    // Write your code here && dose < it/k+1
    var dose = 0
    height.forEach { if (it > k && dose < it - k) dose = it - k }
    return dose
}

fun main() {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val k = firstMultipleInput[1].toInt()

    val height = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
