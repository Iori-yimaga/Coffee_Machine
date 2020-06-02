import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val flag = scanner.nextInt()
    var i = 1
    while (i*i<=flag){
        println(i*i)
        i++
    }
}