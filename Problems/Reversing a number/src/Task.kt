import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val sim = scanner.nextInt()
    val i = sim / 100
    val m = (sim / 10) % 10
    val k = sim % 100 % 10
    val cim = k*100 + m*10 + i;
    print(cim)
}