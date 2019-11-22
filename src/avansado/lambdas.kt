package avansado

fun main(args: Array<String>) {
    val num: Int? =null

    /*
    * si es nulo se ejecuta ese bloque de codigo
    *
    * */
    num?.let{

    }
    /*
    *
    *
    *
    * */
    num?.apply {

    }
    /*
    * axcede a las propiedades de ese objeto
    *
    * */
    with(num){

    }

    val resultado=sum(4,7)
    val resulMin = minCuatro("Hola")



}

//lambas
//va ser de tipo funciones regrese entero
//x el primer entero y y el segundo
val sum:(Int,Int) -> Int ={
    x,y -> x+y
}
/*
* it hace referencia ala variable de la funcion
*
*
* */
val minCuatro:(String)->Boolean ={it.length >4}