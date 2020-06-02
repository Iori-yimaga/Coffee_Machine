import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var i = scanner.nextInt()
    var iMax = i
    while (i != 0) {
        i = scanner.nextInt()
        if (i > iMax && i != 0) { iMax = i }
    }
    if (iMax != 0) { println(iMax) }
}