import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val ch1 = scanner.next()
    val ch2 = scanner.next()
    val ch3 = scanner.next()
    if (ch1.single() + 1 == ch2.single() && ch2.single() + 1 == ch3.single()) {
        println("true")
    } else {
        print("false")
    }
}
