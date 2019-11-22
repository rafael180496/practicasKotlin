package avansado

fun main(args: Array<String>) {

    /*
    *
    * sii la ultima es una funcion se abren los bracket si no
    * se hace func={}
    * */
    suma(6,8){
        println("funcion de orden mayoe")
    }

    "hola".funcion {
        println("Funcion")
    }

}
/*
 *
 *
 * funcion extendida
 *
 */

fun String.funcion(func:()->Unit){
    //despedazar el string
    func()
    println("${this.length}")

}


fun suma(num1:Int,num2:Int,func:()-> Unit){
    //funcion anonima
    func()
    println("Suma de $num1 y $num2  =${num1+num2}")
    // o puede ir despues de la funcion

}