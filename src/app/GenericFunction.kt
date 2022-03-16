package app
import data.Function

fun main(){
    val function = Function("Sandrian")
    function.test<Int>(10)
    function.test<String>("10")
    function.test<Boolean>(true)
    function.test<Char>('A')
}