import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val num = scanner.nextInt()
    print(if (num < 0) {
        "negative"
    }else if (num == 0){
        "zero"
    }else{
        "positive"
    })
}