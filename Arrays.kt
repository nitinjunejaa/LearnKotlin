fun main(){
    var thisArr: Array<Char> = arrayOf('n', 'i', 't', 'i', 'n')

    val thatArr: Array<Char>  = arrayOf('k','u','m','a','r')

    val newArr: Array<Char> = arrayOf('j','u','n','e','j')

    thisArr = newArr

    var oldArr: Array<Any> = arrayOf("Hello", 12, 45, false, "Nitin", 'j')


    val stringArr:Array<String> = arrayOf("How", "are", "you")

    println(stringArr[1])   // get function used to find the index can be replaced by the name of the function and the index in square brackets

    stringArr[2] = "Your Parents"

    println(stringArr[2])  // To print any one element of an array

    println(stringArr.size)

    println(stringArr.contentToString()) // This is used to print all the elements of an array

    val arr: Array<Int> = arrayOf(1, 2, 3, 4)

    println(arr.contentToString())


}