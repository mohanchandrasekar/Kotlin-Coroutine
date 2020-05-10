package nulls

import java.lang.Exception

fun main() {

    var message: String = "Message"

    var myMessager: String? = null

    var myMetadata = null

    myMessager = "My message is Welcome"


    println(myMessager.length)
    println(myMetadata)

    var service = ServiceProvider()
    service.createService()?.evaluvate()

}

class Service {
    fun evaluvate() {
        throw Exception("Exception is called")
    }
}

class ServiceProvider {
    fun createService(): Service? {
        return Service()
    }
}