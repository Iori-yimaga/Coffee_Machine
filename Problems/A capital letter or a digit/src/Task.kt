import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val inPut = scanner.next()
    val curDate = inPut.single()
    if(curDate.isUpperCase() || (curDate.isDigit() && curDate != '0')){
        println("true")
    }else{
        println("false")
    }
}