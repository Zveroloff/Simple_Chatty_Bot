import java.util.*

fun square(number: Int) = Math.pow(number.toDouble(), 2.0).toInt()

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}