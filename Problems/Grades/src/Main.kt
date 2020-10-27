import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    var vas = 0
    var vbs = 0
    var vcs = 0
    var vds = 0
    var grade = 0

    repeat(num) {
        grade = scanner.nextInt()

        if (grade == 2) vds++
        if (grade == 3) vcs++
        if (grade == 4) vbs++
        if (grade == 5) vas++
    }

    println("$vds $vcs $vbs $vas")
}