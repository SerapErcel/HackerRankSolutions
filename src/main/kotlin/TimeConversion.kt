import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

// 12:01:00PM

fun timeConversion(s: String): String {
    // Write your code here
    var saat = s.substring(0, 2).toInt()
    val vakit = s.substring(8, 10)
    val kalan = s.substring(2, 8)

    if (saat == 12 && vakit == "AM") {
        saat = 0
    } else if (saat != 12 && vakit == "PM") {
        saat += 12
    }

    val yeniSaat = saat.toString().padStart(2, '0')

    return "$yeniSaat$kalan"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}