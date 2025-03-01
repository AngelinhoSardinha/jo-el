import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val casos = scanner.nextInt() // Nombre de casos de prova
    scanner.nextLine() // Consumim la línia en blanc

    repeat(casos) {
        val k = scanner.nextInt() // Nombre de vots en aquest cas de prova
        scanner.nextLine() // Consumim la línia en blanc

        val vots = mutableMapOf<String, Int>()

        repeat(k) {
            val mapa = scanner.nextLine()
            vots[mapa] = vots.getOrDefault(mapa, 0) + 1
        }

        // Trobar el mapa amb més vots
        val mapaGuanyador = vots.maxByOrNull { it.value }?.key ?: ""
        println(mapaGuanyador)
    }
}