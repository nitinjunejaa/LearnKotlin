fun main() {            // The result of a logical operator will be a boolean result i.e True or False

    val n = 4
    if(n > 0 || n < 0){         // Here or logical operator is used
        println(n)
    }
    else {
        println("The number is zero")
    }

    val a = 3
    if(a >= 0 && a <= 5) {      // Here and logical operator is used
        println("The value lies between 0 and 5")
    }
    else{
        print("The value does not lie between 0 and 5")
    }
    val b = 2
    if(!(a >= 0 && a <= 5)) {      // Here logical not operator is demonstrated. This logical operator will reverse the expected results
        println("The value lies between 0 and 5")
    }
    else{
        println("The value does not lie between 0 and 5")
    }

    val num = 5
    when(num) {
        in 1..10 -> println("Range lies between 1 to 10")
        in 11..20 -> println("Range lies between 11 to 20")
        else -> println("Range not found")
    }

    val num2 = 12           // Here if else block is used to print same result as the upper in block
    if(num2 >=10 && num2 <= 20) {
        println("The number lies between 10 and 20")
    }

}