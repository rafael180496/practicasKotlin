package basico

fun main(args: Array<String>) {

}

fun type(dato:Any){
    when(dato){
        is String -> {
            println(dato.length)
        }
        is Int ->{
            print("${ dato *2 }")
            //rangos
            when(dato){
                 in 1..10->{
                     print("este es un numero de 1 y 10")
                 }
                in 1..100->{
                    print("este es un numero de 1 y 100")
                }
                else ->{
                    print("fuera de rango")
                }
            }

        }
        is Boolean ->{
            print(dato)
        }
        else->print("no se que objeto es")
    }
}
