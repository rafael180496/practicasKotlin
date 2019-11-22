package basico

//funciones
/*
* Unit es un void
*
* */

fun hello(){
    println("hola a todos")
}

/*
* parametros
* */
fun suma(a:Int,b:Int) :Int {
    return  a+b
}

fun maxsimp(a:Int,b:Int)=if(a>b) a else b

fun max(a:Int,b:Int):Int{
    return if(a>b){
        a
    }else{
        b
    }
}



fun main(args: Array<String>) {
    hello()
    println("${suma(5, 3)}")
}