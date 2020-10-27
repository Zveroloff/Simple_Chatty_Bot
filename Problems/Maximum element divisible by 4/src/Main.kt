import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    var max = -1
    var input = -1

    repeat(num) {
        input = scanner.nextInt()

        if (input > max && input % 4 == 0) max = input
    }

    println(max)
}