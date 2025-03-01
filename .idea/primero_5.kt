package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val victories = mutableMapOf<String, Int>() // Diccionari per comptar les victòries
    var winner: String? = null // Variable per guardar el guanyador (si n'hi ha)

    val inputs = generateSequence { scan.nextLine().takeIf { it != "xxx" } }.toList() // Llegeix totes les línies fins a "xxx"

    for (nom in inputs) {
        victories[nom] = victories.getOrDefault(nom, 0) + 1 // Incrementem victòries

        if (victories[nom] == 5) {
            winner = nom
            break // Sortim del bucle tan bon punt algú guanya 5 vegades
        }
    }

    println(winner ?: "NO") // Mostrem el guanyador o "NO" si ningú ha arribat a 5
}