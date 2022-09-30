import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var min = scores[0]
    var max = scores[0]
    val arr = arrayOf(0, 0)
    for (score in scores) {
        if (score < min) {
            min = score
            arr[1] = arr[1] + 1
        } else if (score > max) {
            max = score
            arr[0] = arr[0] + 1
        }
    }
    return arr
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
