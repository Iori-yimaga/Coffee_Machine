import java.util.Scanner

// write your function here

fun sum(n1:Int, n2:Int, n3:Int):Int{
    return n1 + n2 + n3
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}