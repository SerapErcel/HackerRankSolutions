import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import java.util.stream.Collectors.toList
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


/*
 * Complete the 'climbingLeaderboard' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY ranked
 *  2. INTEGER_ARRAY player
 * -input
 * 7
 * 100 100 50 40 40 20 10
 * 4
 * 5 25 50 120
 */

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
    // Write your code here
    val scores: MutableList<Int> = ArrayList(player.size)
    val newRanked = ranked.distinct().sorted()
    for (p in player) {
        var index = Collections.binarySearch(newRanked, p)
        if (index < 0) {
            index += newRanked.size + 2
        } else {
            index = newRanked.size + 1 - (index + 1)
        }
        scores.add(index)
    }
    return scores.toTypedArray()
}

fun main(args: Array<String>) {
    val rankedCount = readLine()!!.trim().toInt()

    val ranked = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val playerCount = readLine()!!.trim().toInt()

    val player = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = climbingLeaderboard(ranked, player)

    println(result.joinToString("\n"))
}
