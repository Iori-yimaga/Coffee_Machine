import java.util.*

/**
 * 在不大于输入n的情况下
 * 从1开始输出i个i
 * @param args Array<String>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    // 输入需要的n
    val n = scanner.nextInt()
    if (n > 0) {
        // 从0到n
        var i = 1
        var count = 0
        while (i <= n) {
            // 不妨碍本身实现计数（输出i次i）
            var j = i
            var k = j
            while (j > 0 && count < n) {
                print("$k ")
                count++
                j--
            }
            i++
        }
    }
}