package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Nombre de casos de prova
    scan.nextLine() // Consumir salt de línia

    repeat(numCasos) {
        val mida = scan.nextInt() // Mida de la fila
        scan.nextLine() // Consumir salt de línia

        val fila = scan.nextLine().split(" ").map { it.toInt() }.toMutableList()
        val direccio = scan.nextLine().trim() // 'L' o 'R'

        fun compactarFila(fila: List<Int>): List<Int> {
            val senseZeros = fila.filter { it != 0 }.toMutableList() // Eliminar zeros

            // Combinar nombres iguals
            for (i in 0 until senseZeros.size - 1) {
                if (senseZeros[i] == senseZeros[i + 1]) {
                    senseZeros[i] *= 2
                    senseZeros[i + 1] = 0
                }
            }

            return senseZeros.filter { it != 0 } + List(mida - senseZeros.count { it != 0 }) { 0 }
        }

        val resultat = if (direccio == "L") {
            compactarFila(fila)
        } else {
            compactarFila(fila.reversed()).reversed()
        }

        println(resultat.joinToString(" "))
    }
}