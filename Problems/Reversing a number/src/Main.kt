import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()

    val last = input % 10
    val middle = input / 10 % 10
    val first = input / 100

    val output = last * 100 + middle * 10 + first

    println(output)
}