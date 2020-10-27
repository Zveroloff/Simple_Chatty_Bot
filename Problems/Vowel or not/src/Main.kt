import java.util.Scanner

fun isVowel(letter: Char) = letter.toLowerCase() in "auioe"

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}