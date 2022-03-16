package app

class Covariant<out T>(val data: T){

    fun takeData(): T{
        return data
    }

}

fun main(){
    val dataCovariantString:Covariant<String> = Covariant("Sandrian Syafri")
    val dataCovariantAny:Covariant<Any> = dataCovariantString

    println(dataCovariantAny.takeData())
}