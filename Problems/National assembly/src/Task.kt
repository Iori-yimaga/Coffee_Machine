import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val curPeople = scanner.nextInt()
    val natAssembly = Math.cbrt(curPeople.toDouble())
    print(natAssembly.toInt())
}