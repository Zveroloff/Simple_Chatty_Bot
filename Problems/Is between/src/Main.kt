import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val uno = scanner.nextInt()
    val dos = scanner.nextInt()
    val tre = scanner.nextInt()

    println(dos >= uno && uno >= tre || dos <= uno && uno <= tre)
}