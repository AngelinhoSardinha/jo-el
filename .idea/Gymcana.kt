package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Nombre de casos de prova
    scan.nextLine() // Consumir salt de línia

    repeat(numCasos) {
        val numNensInicial = scan.nextInt() // Nombre inicial de nens a la cua
        scan.nextLine() // Consumir salt de línia

        val events = scan.nextLine().trim() // Seqüència d'events

        val cua: Queue<Int> = LinkedList() // Estructura per gestionar la cua
        for (i in 1..numNensInicial) {
            cua.add(i)
        }

        var maxNum = numNensInicial // Control del número més alt assignat

        for (event in events) {
            when (event) {
                'S' -> cua.poll() // Nen supera la prova i marxa
                'N' -> cua.add(cua.poll()!!) // Nen falla i torna al final de la cua
                'E' -> {
                    maxNum++
                    cua.add(maxNum) // Entra un nou nen amb el número següent
                }
            }
        }

        println(cua.peek()) // Imprimim el nen al capdavant de la cua
    }
}