import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()
    if(num < 10){
        println("true")
    }else{
        println("false")
    }
}