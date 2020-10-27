import java.lang.Math.abs
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val uno = scanner.next().first()
    val dos = scanner.next().first()

    println(uno == dos || abs(dos - uno) == 32)
}