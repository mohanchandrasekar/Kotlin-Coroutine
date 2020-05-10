package Inheritance

fun main() {

    var child = Child()
    child.validate()

}

open class Parent {

    open fun validate() {
        println("Parent is called validate")
    }
}

class Child : Parent() {

    override fun validate() {
        super.validate()
        println("Child is called validate")
    }
}