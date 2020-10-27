import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()

    var out = "Normal"

    if (h < a) out = "Deficiency"
    if (h > b) out = "Excess"

    println(out)
}