package basics

fun main() {

    val mystring = "Not null"

    var result = if (mystring.length > 100) {
        "length is grater"
    } else {
        "length is less than"
    }

    when (result) {
        "value" -> print("Print value")

        is String -> println("Is print string")

        else -> {
            println("Print not value")
        }


    }
    println(result)
}