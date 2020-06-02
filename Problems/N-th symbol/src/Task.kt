import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val symbol = scanner.nextLine()
    val n = scanner.nextInt()
    print("Symbol # $n of the string \"$symbol\" is \'${symbol[n-1]}\'")
}