package data

class Function(val name:String) {

    //--------------------------
    // Generic Type in Function
    //--------------------------

    fun <T> test(data: T):Unit{
        println(data)
    }

}