// with and apply

fun main(args: Array<String>) {

    var withAndApply = WithAndApply()

    with(withAndApply) {
        name = "Bob"
        age = 30
    }

    withAndApply.apply {
        name = "Bob"
        age = 30
    }.somethingTodo()

}

class WithAndApply {
    // null acceptable
    var name: String? = null
    var age: Int? = null

    fun somethingTodo() {
        println("Do I have to do something?!")
    }

}