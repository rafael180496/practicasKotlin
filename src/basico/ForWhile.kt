package basico

fun main(args: Array<String>) {

    val listanumeros:ArrayList<Int> = arrayListOf<Int>(1,5,6,4,8)

    for(i:Int in listanumeros.indices){
        println(listanumeros[i])
    }
    val frutas= listOf<String>("manzana","piña","uva")

    for (fruta in frutas){
        println(fruta)
    }
    var x=3
    while (x>0){
        x--
        println(x)
    }
    var suma:Int=0
    //dato nullliable
    var input:String?=""

    do{
        print("Ingresa un numero")
        input= readLine()
        suma += input?.toInt() ?:0
    }while (input!="0")

    println("La suma es $suma")


}