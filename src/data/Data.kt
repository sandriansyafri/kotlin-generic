package data

class Data<T,U>(val firstData: T, val secondData:U) {

   fun getFirst():T{
        return firstData
   }

    fun getSecond():U{
        return secondData
    }

    fun printData(){
        println("$firstData | $secondData")
    }

}