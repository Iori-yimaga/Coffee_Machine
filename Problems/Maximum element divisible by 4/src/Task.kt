import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var md4 = 0
    val n = scanner.nextInt()
    if(n <= 30000) {
        repeat(n) {
            val num = scanner.nextInt()
            if(num <= 1000) {
                if (num % 4 == 0) {
                    if (num >= md4) {
                        md4 = num
                    }
                }
            }
        }
        print(md4)
    }else{
        print("error")
    }

}