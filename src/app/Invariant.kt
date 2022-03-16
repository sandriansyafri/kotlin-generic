package app

class Invariant<T>(val name:T) {
}

fun main(){

    val invariantString:Invariant<String> = Invariant("Sandrian")
//    val invartianAny:Invariant<Any> = invariantString

}