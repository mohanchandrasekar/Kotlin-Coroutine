package tidbits

fun main() {
    try {
        checkHasValidNumber("Mohan")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }
}

fun checkHasValidNumber(objects: Any) {
    when (objects) {
        !is Int, Long, Float, Char, Double -> throw NotANumberException("This is not a Number")
    }

}

class NotANumberException(message: String) : Throwable(message) {


}