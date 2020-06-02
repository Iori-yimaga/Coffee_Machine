import java.lang.Math.sqrt
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val shape = scanner.next()
    when(shape){
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            print(0.25* kotlin.math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a)))
        }
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            print(a*b)
        }
        "circle" -> {
            val r = scanner.nextDouble()
            print(3.14*r*r)
        }
    }
}