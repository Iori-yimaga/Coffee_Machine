import java.util.Scanner

// write your function here

fun isVowel(c:Char):Boolean{
    val l = c.toLowerCase()
    return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}