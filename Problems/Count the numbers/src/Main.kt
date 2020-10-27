import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var count = 0

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()

    count = b / n - (a - 1) / n

    println(count)
}