package basico

fun main(args: Array<String>) {

    //es un string pero puede llegar a ser nula con ?
    var a:String?="abc"
    a=null
    // si es nulo regrese cero
    val l1:Int =a?.length ?: 0

    val l2:Int =if(a!=null){
        a.length
    }else{
        0
    }
}