package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Nombre de casos de prova
    scan.nextLine() // Consumir salt de línia

    repeat(numCasos) {
        val n = scan.nextInt() // Nombre total de línies del cas
        scan.nextLine() // Consumir salt de línia

        val mapaCapitals = mutableMapOf<String, String>() // Diccionari país -> capital

        repeat(n - 1) {
            val (pais, capital) = scan.nextLine().split("-")
            mapaCapitals[pais] = capital
        }

        val paisConsulta = scan.nextLine() // País a consultar
        println(mapaCapitals[paisConsulta] ?: "NO HO SE") // Retorna la capital o "NO HO SE"
    }
}