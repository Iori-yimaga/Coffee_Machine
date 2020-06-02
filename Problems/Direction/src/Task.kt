import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val id = scanner.nextInt()
    when (id) {
        0 -> print("do not move")
        1 -> print("move up")
        2 -> print("move down")
        3 -> print("move left")
        4 -> print("move right")
        else -> print("error!")
    }
}