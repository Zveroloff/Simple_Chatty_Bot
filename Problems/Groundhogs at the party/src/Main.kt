import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val peanuts = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()

    val out = peanuts >= 10 && peanuts <= 20 && !isWeekend || peanuts >= 15 && peanuts <= 25 && isWeekend
    println(out)
}