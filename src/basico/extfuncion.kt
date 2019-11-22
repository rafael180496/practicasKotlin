package basico

fun main(args: Array<String>) {

    "Hola mi nombre es sebastian".print()
    println(4.multply(2))

}
//se extiende
fun String.print(){
    println(this)
}
//<T> generic
//listas ordenadas
fun <T> MutableList<T>.swap(index1:Int,index2:Int){
    val tmp:T =this[index1]
    this[index1]=this[index2]
    this[index2]=tmp
}

fun Int.multply(numM:Int): Int{
    return this * numM
}