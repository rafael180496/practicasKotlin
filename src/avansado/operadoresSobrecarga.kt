package avansado


data class Tiempo(val years:Int, val days:Int)

data class Contador(private var index: Int){
    operator fun inc():Contador{
        return Contador(index + 1)
    }
}

/*
*
* crea un operador para este tipo de clas
* tiempo + tiempo
* */
operator fun Tiempo.plus(other:Tiempo):Tiempo{
    return Tiempo(this.years + other.years,this.days + other.days)
}

fun main(args: Array<String>) {

    val tiempo1 = Tiempo(2017,17)
    val tiempo2 = Tiempo(1991,20)

    val sumaTiempo = tiempo1 + tiempo2

    println(sumaTiempo)

    var contador = Contador(5)
    println(contador.inc())
}