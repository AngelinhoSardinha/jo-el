package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val victorias = mutableMapOf<String, Int>() // Diccionario para contar las victorias
    var winner: String? = null // Variable para guardar al ganador (si lo hay)

    val inputs = mutableListOf<String>()
    var input: String?

    // Leemos todas las líneas hasta que se ingrese "xxx"
    while (true) {
        input = scan.nextLine()
        if (input == "xxx") break
        inputs.add(input)
    }

    // Verificamos el ganador sin usar 'break'
    for (nombre in inputs) {
        victorias[nombre] = victorias.getOrDefault(nombre, 0) + 1 // Incrementamos victorias

        // Si alguien llega a 5 victorias, asignamos el ganador y salimos del ciclo.
        if (victorias[nombre] == 5 && winner == null) {
            winner = nombre
        }
    }

    println(winner ?: "NO") // Mostramos el ganador o "NO" si nadie ha llegado a 5
}
