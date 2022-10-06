import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here

    /* First Try
    var counter = 0
    var pairs = 0
    val arr = ar.toHashSet()
    for (i in 0 until arr.size) {
        for (j in 0 until n) {
            if (arr.elementAt(i) == ar[j]) {
                counter++
                if (counter % 2 == 0) {
                    pairs++
                }
            }
        }
        counter = 0
    }
    return pairs
     */

    // From: https://wise4rmgodadmob.medium.com/sales-by-match-hackerank-solved-using-kotlin-94e52bda7cc7
    val map = ar.groupBy { it }.mapValues { it.value.count() }
    var count = 0
    for (i in map) {
        if (i.value >= 2) {
            count += i.value / 2
        }
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
