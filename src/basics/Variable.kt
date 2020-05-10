package basics

fun main() {

    var streetName = "High school street"

    var streetNumber: Int = 100

    streetName = "222"

    val number = 100

    // String


    var myFLoat = 10F

    var myLong = 20L

    var myBinary = 0xb01


    var myName = "Mohan"

    var mychar = 'M'

    val multipleLine = """
        
        This is multilpe live 
        
        code is very important for life
        
        Welcome to Kolin programming
        
    """.trimIndent()

    println(multipleLine)


    //String interplation

    val code = 404

    val codeline = "Error code is $code and please check"

    println(codeline)

    val mesage = "My name is Mohan Chandrasekar"

    val anotherMessage = "Main messgae length is ${mesage.length} \n "

    println(anotherMessage)
}