import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.math.min
import kotlin.ranges.*
import kotlin.text.*


/*
 * Complete the 'formingMagicSquare' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY s as parameter.
 */

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    // Write your code here
    val msCombinations = arrayOf(
        arrayOf(intArrayOf(4, 9, 2), intArrayOf(3, 5, 7), intArrayOf(8, 1, 6)),
        arrayOf(intArrayOf(4, 3, 8), intArrayOf(9, 5, 1), intArrayOf(2, 7, 6)),
        arrayOf(intArrayOf(8, 3, 4), intArrayOf(1, 5, 9), intArrayOf(6, 7, 2)),
        arrayOf(intArrayOf(8, 1, 6), intArrayOf(3, 5, 7), intArrayOf(4, 9, 2)),
        arrayOf(intArrayOf(6, 1, 8), intArrayOf(7, 5, 3), intArrayOf(2, 9, 4)),
        arrayOf(intArrayOf(6, 7, 2), intArrayOf(1, 5, 9), intArrayOf(8, 3, 4)),
        arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8)),
        arrayOf(intArrayOf(2, 9, 4), intArrayOf(7, 5, 3), intArrayOf(6, 1, 8))
    )
    var min = 100

    for (i in msCombinations.indices) {
        var change = 0
        for (j in 0..2) {
            for (k in 0..2) {
                change += abs(s[j][k] - msCombinations[i][j][k])
            }
        }
        min = min(change, min)
    }
    return min
}

fun main() {

    val s = Array(3) { Array(3) { 0 } }

    for (i in 0 until 3) {
        s[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}
