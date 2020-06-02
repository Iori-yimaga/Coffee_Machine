import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    print(if (x1 == x2 || y1 == y2 || (abs(x1 - x2) == abs(y1 - y2))){
        "YES"
    }else{
        "NO"
    })
}