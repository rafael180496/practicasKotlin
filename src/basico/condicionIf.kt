package basico

fun main(args: Array<String>) {
    var data =5
    val b:Boolean = if(data>0){
        println("$data")
         true
    }else{
        println("$data")
          false
    }
}

fun esMayor(data:Int):Boolean{
    if(data>0){
        println("$data")
        return true
    }else{
        println("$data")
        return  false
    }
}

fun defineTIpo(data : Any){
    if(data is String){
        print(data.length)
    }else if(data is Int){
        print("${data*2}")
    }
}