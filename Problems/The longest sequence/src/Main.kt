import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var number = scanner.nextInt()
    var counter = 1
    var result = 1

    repeat(n - 1) {
        val next = scanner.nextInt()
        if (number > next) {
            counter = 1
        } else {
            counter++
            if (result < counter) result = counter
        }
        number = next
    }

    println(result)
}