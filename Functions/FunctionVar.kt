import kotlin.math.pow

fun main(){
    var fn=::addition
    println(fn(4.5,8.0))

    fn=::power
    println(fn(2.0,3.0))
}
fun addition(a:Double, b:Double): Double
{
    return a+b
}
fun power(a:Double, b:Double): Double
{
    return a.pow(b)
}