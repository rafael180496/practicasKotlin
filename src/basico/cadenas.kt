package basico

fun main(args: Array<String>) {
    val srt="Una cadena de string normal"

    val nombre="Mabel"
    val edad=25

    val sentencia:String= "Ella es $nombre y tiene $edad años"

    println(sentencia)

    val cumpl="$nombre cumple ${edad+1 }"

    println(cumpl)

    val text="""
    >Este es un string que quiero imprimir que es demasiado largo y tiene
    >varios reglones

    """.trimMargin(">")

    println(text)
}