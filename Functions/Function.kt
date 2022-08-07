fun main() {                         // The code witten only in main function will be executed as it is the starting point of the function
    functionName()
    println(timeThree(4587))
    println(timeFour(87))
    evenOrOdd(12)
    evenOrOdd(15)
    printMessage(4)
    printMessage()                  // If we do not write the number of time we want the output then it will take the default one defined in the function
}
fun functionName(): Unit{
    println("This is just a normal print statement")
}
fun timeThree(x: Int): Int {                 // This is block body function
    val result = x*3
    return result
}
fun timeFour(n:Int)= n*4                   // This is Expression body function

fun evenOrOdd(num1: Int){
    val comparison = if (num1%2 == 0) "Even" else "Odd"
    println(comparison)
}
fun printMessage(count: Int = 3){           // This is a default argument. **count here is a parameter**
    for (i in 1..count){
        println("Hello $i")
    }

}






