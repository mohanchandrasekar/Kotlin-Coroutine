package tidbits

private var input: Any = 10
fun main() {

    var string = input as? String

    print(string?.length)

}

open class Person {

}

class Employee : Person() {

    fun vacationDays(days: Int): Int {
        if (days < 60) {
            println("Need more vaction days")
        }
        return days
    }
}

class ContractEmployee : Person() {

}