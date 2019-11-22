package basico

import java.lang.NumberFormatException

//Singletons
object Validaciones{
    fun passwordValida(psw:String):Boolean{
        //isNotEmpty si esta vacia un true sino false
        return psw.isNotEmpty() && psw.length >10
    }

    fun esNumero(dato:Any):Boolean{
        return dato is Int
    }

}

//clase universal
class  ClaseUniversal{

    //va contener un singletonk
    companion object {
        fun create():ClaseUniversal = ClaseUniversal()
    }

}

fun main(args: Array<String>) {

    println("Ingresa tu contraseña")
    //no importa si es nulo o no
    val passw:String = readLine()?:"0"
    print(Validaciones.passwordValida(passw))

    println("Ingresa tu numero")
    //execpcion
    try {
        val numero:Int = readLine()?.toInt()?:0
        print(Validaciones.esNumero(numero))
    }catch (e:NumberFormatException){
        print(e)
    }
    val claseuniversal=ClaseUniversal.create()

}

fun data(){
    /// la misma instancia
    val claseuniversal=ClaseUniversal.create()
}