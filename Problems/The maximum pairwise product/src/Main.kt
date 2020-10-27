import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var max = 0
    val lst = mutableListOf<Int>()

    repeat(n) {
        max = scanner.nextInt()
        lst.add(max)
    }

    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            val tmp = lst[i] * lst[j]
            if (tmp > max) max = tmp
        }
    }

    println(max)
}