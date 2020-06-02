fun main() {
    val input = readLine()!!
    // write code here
    if(input.isNotEmpty()) {
        when (input.first()) {
            'i' -> {
                print(input.drop(1).toInt() + 1)
            }
            's' -> {
                print(input.drop(1).reversed())
            }
            else -> {
                print(input)
            }
        }
    }else{
        print("")
    }
}