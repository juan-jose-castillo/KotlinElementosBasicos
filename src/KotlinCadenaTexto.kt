import java.util.*

/**
 * Created by juanjosecastillo on 4/6/17.
 */

fun main(args: Array<String>)
{

    println("Escribe tu nombre")
    val scanner = Scanner(System.`in`)
    val nextLine= scanner.nextLine()

    // CASO UNO

    val nombre = if(nextLine!="")nextLine else "Kotlin"
    // uso de plantillas de text  el string template es $nombre
    println("El nombre es $nombre!")


    // CASO DOS MAS SIMPLIFICADO

    // uso de plantillas de text  el string template esta en llaves { }
    println("El nombre es ${if(nextLine!="")nextLine else "Kotlin"
    }!")

}
