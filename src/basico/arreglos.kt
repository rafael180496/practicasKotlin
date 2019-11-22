package basico

fun main(args: Array<String>) {

    val arrA:IntArray = intArrayOf(1,5,3,4,4,8,8)
    val listA= arrayListOf<String>()
    listA.add("Hola")
    listA.add("Hola")
    listA.add("Hola")
    val num:Int=arrA[0]
    //pos 2 = 10
    arrA.set(2,10)
    arrA[2]=10

    val mutableList:MutableList<Int> = mutableListOf(2,3,5,4,8)
    //al final de la lista
    mutableList.add(9)

    val nnn= arrayListOf<Int>(1,5,6,8,7)
    mutableList.add(2,9)

    val map :MutableMap<String,Int> = mutableMapOf<String,Int>(Pair("key",30))
    map.put("key2",40)

}