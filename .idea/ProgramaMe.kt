package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Número de casos de prueba
    scan.nextLine() // Consumir salto de línea

    repeat(numCasos) {
        val n = scan.nextInt() // Número total de líneas del caso
        scan.nextLine() // Consumir salto de línea

        val ganadores = mutableMapOf<String, Int>() // Diccionario alias -> número de victorias

        repeat(n - 1) {
            val (_, alias) = scan.nextLine().split("-") // Ignoramos el año y guardamos el alias
            ganadores[alias] = ganadores.getOrDefault(alias, 0) + 1 // Contamos victorias
        }

        val aliasConsulta = scan.nextLine() // Alias a consultar
        println(ganadores[aliasConsulta] ?: 0) // Devuelve el número de victorias o "0"
    }
}
