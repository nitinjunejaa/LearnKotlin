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
        println("${a[q]}")
    }
    for(i in 1..10 step 2){
        println(i)
    }

    var q = 1
    while (q <= 10){
        println(q)
        q += 2

    }
    var w = 1
    do {
        println(w)
        w += 2
    }
        while (w <= 10)

    var t = 1
    while (t <= 100){
        println(t)
        t += 2
    }

    var y = 1
    do {
        println(y)
        y += 2
    }
        while (y <= 100)
}