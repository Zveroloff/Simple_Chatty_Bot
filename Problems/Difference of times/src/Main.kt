import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val m1 = scanner.nextInt()
    val s1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val m2 = scanner.nextInt()
    val s2 = scanner.nextInt()

    val hdif = h2 - h1
    val mdif = m2 - m1
    val sdif = s2 - s1

    val out = hdif * 3600 + mdif * 60 + sdif

    println(out)
}