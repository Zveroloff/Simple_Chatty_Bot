import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val uno = scanner.next().first()
    val dos = scanner.next().first()
    val tre = scanner.next().first()

    println(dos - uno == 1 && tre - dos == 1)
}