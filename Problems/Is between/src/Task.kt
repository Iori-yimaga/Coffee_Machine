import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()
    if(n1 in n2..n3 || n1 in n3..n2){
        println("true")
    }else{
        println("false")
    }
}