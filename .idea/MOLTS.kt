package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Nombre de casos de prova
    scan.nextLine() // Consumir salt de línia

    repeat(numCasos) {
        val n = scan.nextInt() // Mida de l'array
        scan.nextLine() // Consumir salt de línia
        val array = scan.nextLine().split(" ").map { it.toInt() } // Llista de nombres
        val d = scan.nextInt() // Desplaçament
        scan.nextLine() // Consumir salt de línia

        val dMod = d % n // Ajustem el desplaçament perquè no sigui més gran que la mida de l'array
        val resultat = array.takeLast(dMod) + array.dropLast(dMod) // Rotació dreta eficient

        println(resultat.joinToString(" ")) // Imprimim la llista desplaçada
    }
}