package machine
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var water = 400
    var milk = 540
    var coffeeBeans = 120
    var cups = 9
    var money = 550
    var action: String
    var flag = true
    var choice: String
    while (flag) {
        print("Write action (buy, fill, take, remaining, exit): ")
        action = scanner.next()
        println()
        when (action) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                choice = scanner.next()
                when (choice) {
                    "1" -> {
                        if (water - 250 < 0) {
                            println("Sorry, not enough water!")
                        } else if (coffeeBeans - 16 < 0) {
                            println("Sorry, not enough coffee beans!")
                        } else if (cups - 1 < 0) {
                            println("Sorry, not enough cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= 250
                            coffeeBeans -= 16
                            cups -= 1
                            money += 4
                        }
                        println()
                    }
                    "2" -> {
                        if (water - 350 < 0) {
                            println("Sorry, not enough water!")
                        } else if (milk - 75 < 0) {
                            println("Sorry, not enough milk!")
                        } else if (coffeeBeans - 20 < 0) {
                            println("Sorry, not enough coffee beans!")
                        } else if (cups - 1 < 0) {
                            println("Sorry, not enough cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= 350
                            milk  -= 75
                            coffeeBeans -= 20
                            cups -= 1
                            money += 7
                        }
                        println()
                    }
                    "3" -> {
                        if (water - 200 < 0) {
                            println("Sorry, not enough water!")
                        } else if (milk - 100 < 0) {
                            println("Sorry, not enough milk!")
                        } else if (coffeeBeans - 12 < 0) {
                            println("Sorry, not enough coffee beans!")
                        } else if (cups - 1 < 0) {
                            println("Sorry, not enough cups!")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= 200
                            milk  -= 100
                            coffeeBeans -= 12
                            cups -= 1
                            money += 6
                        }
                        println()
                    }
                    "back" -> {
                        println()
                    }
                }
            }
            "fill" -> {
                print("Write how many ml of water do you want to add: ")
                water += scanner.nextInt()
                print("Write how many ml of milk do you want to add: ")
                milk += scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: ")
                coffeeBeans += scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                cups += scanner.nextInt()
                println()
            }
            "take" -> {
                println("I gave you $$money")
                println()
                money = 0
            }
            "remaining" -> {
                println("The coffee machine has:")
                println("$water of water")
                println("$milk of milk")
                println("$coffeeBeans of coffee beans")
                println("$cups of disposable cups")
                println("$$money of money")
                println()
            }
            "exit" -> {
                flag = false
            }
        }
    }
}