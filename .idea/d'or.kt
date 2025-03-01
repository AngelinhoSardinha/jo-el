import java.util.*

data class Planeta(val nom: String, val distancia: Double, val tamany: Double)

fun main() {
    val scan = Scanner(System.`in`)
    val casos = scan.nextInt() // Leer el número de casos
    scan.nextLine() // Consumir la línea vacía

    repeat(casos) {
        val n = scan.nextInt()
        scan.nextLine() // Consumir la línea vacía

        val planetes = mutableListOf<Planeta>()

        repeat(n) {
            val linea = scan.nextLine().trim() // Limpiar espacios extra
            val parts = linea.split(" ").filter { it.isNotEmpty() } // Evitar elementos vacíos

            if (parts.size == 3) {
                try {
                    val nom = parts[0]
                    val distancia = parts[1].toDouble()
                    val tamany = parts[2].toDouble()
                    planetes.add(Planeta(nom, distancia, tamany))
                } catch (e: NumberFormatException) {
                    println(linea)
                    return
                }
            } else {
                println(linea)
                return
            }
        }

        // Ordenamos los planetas por distancia
        planetes.sortBy { it.distancia }

        // Encontramos la distancia mediana
        val distanciaMediana = planetes[n / 2].distancia

        // Filtramos los planetas con esa distancia
        val planetesFiltrats = planetes.filter { it.distancia == distanciaMediana }

        // Si hay más de un planeta con la misma distancia, buscamos el que tenga el tamaño mediano
        val planetaSeleccionat = if (planetesFiltrats.size == 1) {
            planetesFiltrats[0]
        } else {
            planetesFiltrats.sortedBy { it.tamany }[planetesFiltrats.size / 2]
        }

        println(planetaSeleccionat.nom)
    }
}