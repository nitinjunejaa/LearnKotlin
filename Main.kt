fun main(){
    val n = "Hello, how are you"

    val stringLength = n.length // This is a length function in string to find out the length
    val stringIndex = n.get(11)
    println(stringLength) // In the output length the spaces in the string will also be counted\



    println("The character at index 11 is ${n.get(11)}")

    println(n.subSequence(0, 5))

    val i = 11
    println("The value of i is $i")
}
