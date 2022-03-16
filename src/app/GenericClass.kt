package app

import data.Data

fun main(){

   val dataStringInt:Data<String,Int> = Data("String",10)
    val dataStringString: Data<String,String> = Data("Sandrian","Syafri")

    dataStringInt.printData()
    println(dataStringInt.getFirst())
    println(dataStringInt.getSecond())
}