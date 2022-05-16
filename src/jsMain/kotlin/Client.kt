import kotlinx.browser.document
import react.create
import react.dom.render

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    render(welcome, container)
    usedFunction()
    println(usedVal)
}

fun usedFunction() {
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
    println("This function is used!!")
}

val usedVal: Int = 0
