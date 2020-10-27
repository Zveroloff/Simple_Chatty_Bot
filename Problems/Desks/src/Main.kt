import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val room1 = scanner.nextInt()
    val room2 = scanner.nextInt()
    val room3 = scanner.nextInt()

    val ndesks1 = room1 / 2 + room1 % 2
    val ndesks2 = room2 / 2 + room2 % 2
    val ndesks3 = room3 / 2 + room3 % 2

    val output = ndesks1 + ndesks2 + ndesks3

    println(output)
}