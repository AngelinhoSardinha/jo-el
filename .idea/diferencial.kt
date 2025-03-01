import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt() // Número de líneas
    scanner.nextLine() // Consumir la línea en blanco

    val diferencialEspatllat = scanner.nextLine().trim() // Primer diferencial es el espatllat
    val estatDiferencials = mutableMapOf<String, Boolean>() // Mapa per emmagatzemar l'estat dels diferencials

    repeat(n - 1) {
        val diferencial = scanner.nextLine().trim()

        if (diferencial == diferencialEspatllat) {
            // Si es toca el diferencial espatllat, tots els diferencials cauen
            estatDiferencials.keys.forEach { estatDiferencials[it] = false }
        } else {
            // Si no és el diferencial espatllat, canviem el seu estat
            estatDiferencials[diferencial] = !(estatDiferencials[diferencial] ?: false)
        }
    }

    // Contem quants diferencials estan a true i quants a false
    val trueCount = estatDiferencials.values.count { it }
    val falseCount = estatDiferencials.values.count { !it }

    println("$trueCount $falseCount")
}