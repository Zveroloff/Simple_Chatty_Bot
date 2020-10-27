import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    var counter = 0

    repeat(num) {
        val cur = scanner.nextInt()

        if (cur > 0) counter++
    }

    println(counter)
}