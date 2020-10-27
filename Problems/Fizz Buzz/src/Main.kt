import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val start = scanner.nextInt()
    val end = scanner.nextInt()

    for (x in start..end) {
        if (x % 3 == 0 && x % 5 == 0) {
            println("FizzBuzz")
        } else if (x % 3 == 0) {
            println("Fizz")
        } else if (x % 5 == 0) {
            println("Buzz")
        } else {
            println(x)
        }
    }
}