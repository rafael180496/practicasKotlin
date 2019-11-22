package basico

fun main(args: Array<String>) {

    var rodrigo =Familiar()
    //destructor de objetos
    val (name:String,_,color:String) = basico.Familiar()

    val (resultad:Int,estatus:Boolean)= calcular(4,3)
}


data class Result(var result:Int,var status:Boolean)
fun calcular(a:Int,b:Int):Result{
    return if(a*2 >b){
        Result(a*2,true)
    }else{
        Result(a,false)
    }
}


data class  Familiar(var name:String="RAfa",var age:Int=20,var colorCabello:String="Cafe"){



}