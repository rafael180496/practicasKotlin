package basico

fun main(args: Array<String>) {

    //rango dentro del 1 asta el 4
    for(i:Int in 1..4){
        print(i)
    }
    //rango dentro del 4 asta el 1
    for(i:Int in 4..1){
        print(i)
    }

    //rango dentro del 4 asta el 1
    for(i:Int in 4 downTo  1){
        print(i)
    }

    //rango dentro del 4 asta el 1 con saltos de 2 en 2 con step
    for(i:Int in 4..1 step 2){
        print(i)
    }

    //rango dentro del 4 asta el 1
    for(i:Int in 4 downTo  1 step 2){
        print(i)
    }

    //rango dentro del 4 asta el 9  que no tome el ultimo numero
    for(i:Int in 1 until   10 ){
        print(i)
    }
    //el ultimo es 11
    val esOnce=(1..12 step 2).last==11
}