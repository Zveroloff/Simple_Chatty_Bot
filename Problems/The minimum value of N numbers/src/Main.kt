import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()

    var min = scanner.nextInt()
    repeat(num - 1) {
        val tmp = scanner.nextInt()
        min = if (tmp < min) tmp else min
    }

    println(min)
    
}