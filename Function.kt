//fun main() {                         // The code witten only in main function will be executed as it is the starting point of the function
//    functionName()
//    println(timeThree(4587))
//    println(timesthree(45))
//    println(timeFour(87))
//    println(timesFour(48))
//
//
//}
//
//fun functionName(): Unit{
//    println("This is just a normal print statement")
//}
//
//fun timeThree(x: Int): Int {                 // This is block body function
//    val result = x*3
//    return result
//}
//
//fun timesthree(y:Int) = y *3                 // This is Expression body function
//
//fun timeFour(n:Int): Int{
//    val output = n * 4
//    return output
//}
//
//fun timesFour(j:Int) = j*4
//
//

fun main() {
    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    print(compareArrayLength(a, b))
}

// Create compareArrayLength() function here
fun compareArrayLength(a: Array<String>, b: Array<String>) {
    if(a.size == b.size) {
        println("Both the strings are of same size")
    } else {
        println("The string of different length")
    }
}

