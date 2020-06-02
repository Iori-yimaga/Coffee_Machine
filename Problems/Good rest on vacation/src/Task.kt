import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val dura = scanner.nextInt()
    val totalFood = scanner.nextInt()
    val oneWay = scanner.nextInt()
    val cost = scanner.nextInt()
    print((dura-1)*cost + dura*totalFood + oneWay*2)
}