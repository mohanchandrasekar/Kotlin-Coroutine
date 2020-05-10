package function

import java.sql.Struct

fun main() {

    hello()

    returingAValue().also {
        print(it)
    }

    returnString("Mohan")

    sum(1, 2)

    add(190, 22)

    printDetails("Mohan", phone = 2222)

    throwException()

}

fun hello(): Unit {
    println("Hello")

}

fun throwException(): Nothing {
    throw Exception("Throw nothing exception")
}

/**
 * returning a value
 */

fun returingAValue(): Int {
    return 2
}

/**
 * print string
 */

fun returnString(name: String) {
    println(name)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Int, b: Int) = a + b

/**
 * print details
 */
fun printDetails(name: String, email: String = "", phone: Int) {

    println("the name is $name and email is $email and phone number is $phone")
}

