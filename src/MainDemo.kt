import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    executeDemo()
    println("Hello word is called")
}

fun execute(number: Int): Int {
    return number * 10
}

fun executeDemo() = runBlocking {
    println("One is called : ${Thread.currentThread().name}")
//    execute(10)
    val job = GlobalScope.launch {
        println("Two is called : ${Thread.currentThread().name}")
    }
    println("Three is called : ${Thread.currentThread().name}")
    job.join()
}