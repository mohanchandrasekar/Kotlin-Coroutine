package basics

fun main() {

    var range = 1..100

    range.forEach { print(it) }

    for (a in range) {
        print(a)
    }

    for (a in 1..1000)
        print(a)

    for (a in 100 downTo 1)
        print(a)

}