import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val ch1 = scanner.next()
    val ch2 = scanner.next()
    if(ch1 == ch2 || ch1.toUpperCase() == ch2 || ch1.toLowerCase() == ch2){
        print("true")
    }else{
        print("false")
    }
}