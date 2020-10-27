import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()

    val last = input % 10
    val mid = input / 10 % 10
    val first = input / 100

    val out = first + mid + last
    println(out)
}