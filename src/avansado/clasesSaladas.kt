package avansado


sealed class Intencion{
    class Refrescar:Intencion()
    class RegargarMar:Intencion()
}

sealed class Intencion2{
    object Refrescar:Intencion2(){
        override fun log() {
            println("Refresxar")
        }
    }
    object Cargar:Intencion2(){
        override fun log() {
            println("Cargar")
        }
    }
    data class  Error(val razon:String):Intencion2(){
        override fun log() {
            println("$razon")
        }
    }
    abstract fun log()
}


fun main(args: Array<String>) {
    val intencion:Intencion =Intencion.Refrescar()

    val output:String=when(intencion){
        is Intencion.Refrescar -> "refresh"
        is Intencion.RegargarMar -> "refresh"
    }
}