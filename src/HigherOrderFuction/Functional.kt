package HigherOrderFuction

fun main() {
    create(12, 2, ::sum)
}

fun create(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(a: Int, b: Int) = a + b

fun create(id: Int, name: String, action: (Int, Int) -> Unit) {

}

fun create(id: Int, name: String, vararg action: (String, String, String) -> String) {

}