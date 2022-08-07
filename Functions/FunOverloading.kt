fun main(){
    println(sum(1,2))
    println(sum(2.0,5.2))
}

fun sum(a:Int, b:Int): Int
{
    return a + b

}
fun sum(a:Double, b:Double): Double
{
    return a + b
}