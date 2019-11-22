package basico

//data clase
/*
*
* da axeso a los get y setter de los codigos
*
* */
//private en el contructor para poner esa variable privada
data class Auto(var marca:String,private var puertas:Int){
    var numPutertas=puertas
    get() {
        //field hace referencia a numeros de puertas
        return  if(field>0) field else 1
    }

}


data class Persona2(var name:String,val age: Int,val color :String){

}

fun main(args: Array<String>) {
    val auto= Auto("BMW", 0)
    println(auto.toString())
    var marca:String=auto.marca

    auto.marca="FORD"

    println(auto.toString())
    val mabel= Persona2("Mabel", 24, "CAFE")
    println(mabel.toString())
    //metodo copy toma de un objeto que existe lo copia
    val marla=mabel.copy(name="Marla")
    println(marla.toString())

    val darla=mabel
    darla.name="Darla"
}