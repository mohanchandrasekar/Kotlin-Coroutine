package tidbits

fun main() {
    val result = capitalAndPopulation("India")
    val (country, index, capital) = captialAndPoulation("Sweden", "1 Crore", "Stockholm")
    println(result.first)
    println(result.second)

}

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair(country, 23330303)
}

fun captialAndPoulation(country: String, index: String, captial: String): Triple<String, String, String> {
    return Triple(country, index, captial)
}