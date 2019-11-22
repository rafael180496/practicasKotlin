package basico

fun main(args: Array<String>) {
    saluda()
    saluda("HOla que paso")
    otrafuncion(esAdulto = true)
    val objet= P1()

}
fun saluda(saludo:String="Hola a todos"){
    println("$saludo")
}
fun otrafuncion(edad:Int=0,esAdulto:Boolean=false,tieneRopa:Boolean=true){

}

data class P1(var a:Int=0)