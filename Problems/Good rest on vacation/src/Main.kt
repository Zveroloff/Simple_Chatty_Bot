import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val duration = scanner.nextInt()
    val foodcost = scanner.nextInt()
    val flight = scanner.nextInt()
    val nightcost = scanner.nextInt()

    val total: Long = foodcost * duration + nightcost * (duration - 1) + flight * 2L

    println(total)
}
