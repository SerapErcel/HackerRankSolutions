import kotlin.math.abs

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */
fun getEbob(n1: Int, n2: Int): Int {
    return if (n2 == 0) {
        n1
    } else getEbob(n2, n1 % n2)
}

fun getEkok(n1: Int, n2: Int): Int {
    return if (n1 == 0 || n2 == 0) 0 else {
        val ebob = getEbob(n1, n2)
        abs(n1 * n2) / ebob
    }
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here

    var result = 0

    // a icin en kucuk ortak kat
    var ekok = a[0]
    for (i in a) {
        ekok = getEkok(ekok, i)
    }

    // b icin en buyuk ortak bolen
    var ebob = b[0]
    for (i in b) {
        ebob = getEbob(ebob, i)
    }

    // ebob'u bolen ekok katlari
    var sayac = 0
    while (sayac <= ebob) {
        sayac += ekok
        if (ebob % sayac == 0) result++
    }
    return result
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}