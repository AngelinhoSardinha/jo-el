package controllers

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val numCasos = scan.nextInt() // Nombre de casos de prova
    scan.nextLine() // Consumir salt de línia

    repeat(numCasos) {
        val n = scan.nextInt() // Nombre total de línies del cas
        scan.nextLine() // Consumir salt de línia

        val guanyadors = mutableMapOf<String, Int>() // Diccionari alias -> nombre de victòries

        repeat(n - 1) {
            val (_, alias) = scan.nextLine().split("-") // Ignorem l'any i guardem l'alias
            guanyadors[alias] = guanyadors.getOrDefault(alias, 0) + 1 // Comptem victòries
        }

        val aliasConsulta = scan.nextLine() // Alias a consultar
        println(guanyadors[aliasConsulta] ?: 0) // Retorna el nombre de victòries o "0"
    }
}