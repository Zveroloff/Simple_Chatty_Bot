import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()

    if (input > 0) {
        println("positive")
    } else if (input < 0) {
        println("negative")
    } else {
        println("zero")
    }
}