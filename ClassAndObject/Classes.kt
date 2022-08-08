fun main(){
    val msport = Car("F10 M5", "Hybrid", 500.12, 2020)
    val amg = Car("Eclass", "Petrol", 100.24, 2021)

    println(msport.name)
    println(msport.type)

    println(amg.name)
    println(amg.type)

    msport.driveCar()
    amg.driveCar()
    amg.applyBrakes()

}
class Car (val name:String, val type: String, var kmsRun: Double, val YOM: Int)             // Properties
{
    fun driveCar(){         // Methods
        println("$name The car is being driven")            // If we want to specify the name for the property.
    }

    fun applyBrakes() {
        println("The brakes are applied")
    }
}
