import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() // Nombre de casos de prova
    scanner.nextLine() // Consumim la línia en blanc

    repeat(casos) {
        val n = scanner.nextInt() // Cada quants aperitius Dani roba un
        scanner.nextLine() // Consumim la línia en blanc
        val aperitius = scanner.nextLine().split(" ") // Llista d'aperitius

        // Filtrar només els aperitius que NO són robats per Dani
        val resultat = aperitius.filterIndexed { index, _ -> (index + 1) % n != 0 }

        // Imprimir la llista resultant
        println(resultat.joinToString(" "))
    }
}