import kotlin.math.max

/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here

    val frequency = IntArray(100) { 0 }

    var result = 0

    for (i in a.indices) {
        val index = a[i]
        frequency[index]++
    }

    for (i in 1..100) {
        result = max(result, frequency[i] + frequency[i - 1])
    }


    return result

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
