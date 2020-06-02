import kotlin.math.abs

// write the BankAccount class here
class BankAccount {
    var deposited : Long
    var withdrawn : Long
    var balance : Long

    constructor(deposited : Long, withdrawn : Long){
        this.deposited = deposited
        this.withdrawn = withdrawn
        this.balance = abs(deposited-withdrawn)
    }
}
//fun main(){
//    val ba = BankAccount(123L, 789L)
//    val d = ba.deposited
//    val w = ba.withdrawn
//    val b = ba.balance
//    print("$d\n$w\n$b")
//}
