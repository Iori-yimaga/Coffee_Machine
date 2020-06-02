import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val b1 = scanner.nextInt()
    val b2 = scanner.nextInt()
    val b3 = scanner.nextInt()
    if(b2 in b3..b1 || b2 in b1..b3){
        println("true")
    }else{
        println("false")
    }
}