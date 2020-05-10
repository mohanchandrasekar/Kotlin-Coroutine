package Class

data class DataCLass(var firstName: String, var lastName: String, var id: String)

fun main() {
    val person = DataCLass("Mohan", "Chandrasekar", "1")
    val person1 = DataCLass("Mohan", "Chandrasekar", "1")

    if (person1 == person) {
        println("Both are same")
    }

    println(person.firstName)
}
