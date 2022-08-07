fun main() {    // This is a expression body demonstration.
    val a = 10
    val b = 11

    val maxValue: Int = if (a > b) {
        a
    } else {
        b
    }
    println(maxValue)


        val n = 15
        val j = 15.0

        if(n > j){
            println("n is greater than j")
        } else if(j > n){
            println("b is greater than a")

        } else {
            println("Both the values are equal")
        }

    val num = 3
    when(num) {
        0 -> println("Zero")
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")

        else -> println("None of the above")
    }

    val num1 = 21
    when {
        num1 == 21 -> println("the number is equal")
        num1 < 0 -> println("The number is nagative")
        else -> println("Zero")
    }
}
