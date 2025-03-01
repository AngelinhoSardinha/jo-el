package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Nombre de casos de prova
    scan.nextLine() // Consumir salt de línia

    repeat(numCasos) {
        val (n, k) = scan.nextLine().split(" ").map { it.toInt() }

        val tasques = mutableListOf<Pair<Int, String>>() // Llista de parells (prioritat, tasca)

        repeat(n) {
            val linia = scan.nextLine().split(" ", limit = 2)
            val prioritat = linia[0].toInt()
            val nomTasca = linia[1]
            tasques.add(Pair(prioritat, nomTasca))
        }

        // Ordenem les tasques per prioritat (nombre més petit primer)
        tasques.sortBy { it.first }

        // Obtenim la tasca en la posició K-èsima (1-based index)
        println(tasques[k - 1].second)
    }
}