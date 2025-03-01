package controllers
import java.util.regex.Pattern
import java.util.*
import java.util.regex.Matcher

fun main() {
    //Definimos las variables
    var scan = Scanner(System.`in`)
    //Definimos las varibales
    var numCasos = scan.nextInt()
    scan.nextLine() //Salto de linea

    //Bucle
    repeat(numCasos) {
        val cadena = scan.nextLine()
        val stack = mutableListOf<Char>()
        var esValido = true  // Variable para rastrear si la cadena es válida

        for (char in cadena) {
            if (char == '(') {
                stack.add(char) // Agregar apertura a la pila
            } else if (char == ')') {
                if (stack.isEmpty()) {
                    esValido = false // Hay un `)` sin `(`
                } else {
                    stack.removeAt(stack.size - 1) // Eliminar el último `(`
                }
            }
        }

        // La cadena es válida si `esValido` sigue en `true` y la pila está vacía
        if (esValido && stack.isEmpty()) {
            println("si")
        } else {
            println("no")
        }
    }
}