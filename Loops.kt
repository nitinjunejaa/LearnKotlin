fun main(){
    for(i in 1..10){        // For loop
        println(i)
    }

    var n = 1
    while (n<=10){               // While Loop
        println(n)
        n++
    }

    var j = 1
    do {
        println(j)
        j++
    } while (j <=5 )

    val a = arrayOf("N", "i", "t", "i", "n")

    for (q in 0 until a.size){
        print("${a[q]}")
    }
}