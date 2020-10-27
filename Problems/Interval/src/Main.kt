import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()

    println((input > -15 && input <= 12 || input in 15..16 || input >= 19).toString().capitalize())
}