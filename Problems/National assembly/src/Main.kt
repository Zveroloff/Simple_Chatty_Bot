import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val population = scanner.nextDouble()
    val assembly = Math.cbrt(population)
    println(assembly.toInt())
}