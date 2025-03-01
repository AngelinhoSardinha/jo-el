import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() // Leer el número de casos
    scanner.nextLine() // Consumir el salto de línea

    repeat(casos) {
        val k = scanner.nextInt()
        scanner.nextLine() // Consumir el salto de línea

        val amistats = mutableMapOf<String, String>() // Almacena las amistades

        repeat(k - 1) {
            val (persona1, persona2) = scanner.nextLine().split(" ")
            amistats[persona1] = persona2 // La última relación es la válida
            amistats[persona2] = persona1 // Relación bidireccional
        }

        val nom = scanner.nextLine().trim() // Última línea del caso
        println(amistats[nom] ?: "NO HO SE") // Si no existe, devolver "NO HO SE"
    }
}