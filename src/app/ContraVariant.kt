package app

class ContraVariant<in T> {

    fun sayHello(data: T){
        println(data)
    }

}

fun main(){

    val contraVariantAny = ContraVariant<Any>()
    val contraVariantString: ContraVariant<String> = contraVariantAny
    val contraVariantInt: ContraVariant<Int> = contraVariantAny





}