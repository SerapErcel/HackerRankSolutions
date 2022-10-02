import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'migratoryBirds' function below.
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int {
    // Write your code here
    val s = arr.size
    var max = 0
    var id = 0

    arr.sort()

    for (i in 0 until s) {
        var count = 0
        for (j in i until s) {
            if (arr[i] != arr[j]) {
                break
            } else if (arr[i] == arr[j]) {
                count++
            }
        }
        if (max < count) {
            max = count
            id = arr[i]
        }
    }
    return id
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
