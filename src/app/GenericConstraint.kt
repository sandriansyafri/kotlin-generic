package app


interface Interaction{
    fun sayHello(){
        println("Hello !")
    }
}

open class Employee(val name:String): Interaction{
}

 class Manager: Employee{
    constructor(name:String):super(name)

}

class SuperManager: Employee {
    constructor(name:String):super(name)
}

class Country<T>(val employee : T) where T: Employee, T: Interaction{

    fun printCountryData(){
        println(this.employee)
    }
}

fun main(){

    val superManager = SuperManager("Sandrian")
    val data = Country(superManager)

}