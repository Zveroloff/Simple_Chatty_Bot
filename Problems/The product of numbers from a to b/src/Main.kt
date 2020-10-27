import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var result: Long = a.toLong()

    for (number in a + 1 until b) {
        result *= number
    }

    println(result)
}