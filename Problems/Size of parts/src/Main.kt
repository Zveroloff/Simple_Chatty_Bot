import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    var ready = 0
    var tofix = 0
    var reject = 0
    var current = 0

    repeat(num) {
        current = scanner.nextInt()

        if (current == 1) tofix++
        if (current == -1) reject++
        if (current == 0) ready++
    }

    print(ready)
    print(" ")
    print(tofix)
    print(" ")
    print(reject)
}