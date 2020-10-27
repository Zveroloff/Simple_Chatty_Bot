import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val year = scanner.nextInt()

    var yearType = "Regular"
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        yearType = "Leap"
    }

    println(yearType)
}