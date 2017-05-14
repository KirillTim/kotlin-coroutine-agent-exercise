package example

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking<Unit> {
    println("Started!")
    test()
    test(1234)
    testInside()
    println("Done.")
}

suspend fun testInside() {
    test()
}

suspend fun test(time: Long) {
    println("test($time)")
    delay(time)
}

suspend fun test() {
    println("test()")
    delay(1000)
}
