fun main(args: Array<String>) {

    // infix functions
    // member function or extension function
    // single parameter
    // have prefix infix
    val inputOne = "Hello "
    val name: String = "Marg"
    val greeting = name add " Hi"
    println(greeting)
    val clause = name.plus(inputOne, greeting)
    println(clause)

}

infix fun String.add(input: String): String {
    return this + input
}

fun String.plus(inputOne: String, inputTwo: String): String {
    return this + inputOne + inputTwo
}