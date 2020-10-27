import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val uno = scanner.nextInt()
    val dos = scanner.nextInt()
    val tre = scanner.nextInt()

    val con1 = uno > 0 && dos <= 0 && tre <= 0
    val con2 = uno <= 0 && dos > 0 && tre <= 0
    val con3 = uno <= 0 && dos <= 0 && tre > 0

    println(con1 || con2 || con3)
}