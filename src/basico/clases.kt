package basico
//clases
class Ejemplo{

    //constructor

    fun hola(){
        print("hola ")
    }

}

//constructor principal

class  Persona(val nombre:String){
    init {
        //inicializacion
        println(nombre)
    }
    //constructor secundario
    constructor(nombre:String,edad:Int):this(nombre){
        println("$nombre $edad")
    }

}

//clase padre
open class Base(val inicial:Int){

    open fun imprime(){
        println("Algo $inicial ")
    }
}

//herencias
class General(val d:Int): Base(d){

    //overrider
    override fun imprime() {
        super.imprime()
        val suma:Int =4+d
    }

}

fun main(args: Array<String>) {
    //instancia
    val persona = Persona("Rogelio", 30)
    println(persona)
    val personas = Persona("rafa")
    println(personas)
    val general= General(9)
    general.imprime()
}