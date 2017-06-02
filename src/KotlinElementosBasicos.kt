/**
 * Created by juanjosecastillo on 2/6/17.
 */

/**
 * Created by juanjosecastillo on 2/6/17.
 */

fun main (args: Array<String>)
{
    println (suma(4,3))
    println(suma2(4,3))
}
// declarando la funcion de la suma Parametro : Tipo de Parametro
// caso 1
fun suma (a:Int, b:Int): Int
{
    return (a+b)
}
// caaso 2 se simplifica en una sola linea de codigo
// obteniendo mismo comportamiento
fun suma2 (a:Int, b:Int)=a+b
