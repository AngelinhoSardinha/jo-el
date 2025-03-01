package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Nombre de casos de prova
    scan.nextLine() // Consumir salt de línia

    repeat(numCasos) {
        val n = scan.nextInt() // Nombre de línies del cas de prova
        scan.nextLine() // Consumir salt de línia

        val diccionari = mutableMapOf<String, String>()

        // Llegim les N-1 línies i omplim el diccionari
        repeat(n - 1) {
            val (pais, capital) = scan.nextLine().split("-")
            diccionari[pais] = capital
        }

        val capitalBuscada = scan.nextLine() // Última línia del cas: la capital a buscar

        // Imprimim el diccionari ordenat
        println(diccionari.toSortedMap())

        // Busquem la clau (país) pel valor (capital)
        val paisTrobat = diccionari.entries.find { it.value == capitalBuscada }?.key

        // Imprimim el resultat
        if (paisTrobat != null) {
            println(paisTrobat)
        }
    }
}