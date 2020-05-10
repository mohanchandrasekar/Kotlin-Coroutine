package Class

import java.awt.MenuItem
import java.util.*

fun main() {

    val customer = Customer("Mohan", "Chandrasekar", 1990)

    println(customer.customerFullName)


    println(customer.age)

   customer.socialSecurityNumber = "SN3232"
    println(customer.socialSecurityNumber)

    val productList = customer.getProductList()
    println(productList)
}

class Customer(private val firstName: String, private val lastName: String, private val yearOfBirth: Int) {


    var age: Int = 0
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth


    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")){
                throw Exception("Throw the exception is not start with SN")
            }
            field = value
        }


    var id = 100
    var name = "Mohan"
    var productList = listOf("Vest", "pant", "T-shirt")
//    var firstName = "Mohan"
//    var lastName = "CHandrasekar"

    var customerFullName: String = ""
        get() = firstName + " " + lastName

    var item: ArrayList<MenuItem> = arrayListOf()
        set(value) {
            field = value
        }

    fun getCustomerOrder(): Int {
        return getCustomerName(name).length
    }

    fun getCustomerName(namd: String): String {
        return namd
    }

    fun getProductList(): String {
        for (product in productList) return product
        return ""
    }
}