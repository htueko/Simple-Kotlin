fun main(args: Array<String>) {

    // Interoperability
    // can call java from kotlin also kotlin from java as simple meaning
    val multiply = Eleven.multiply(3, 4)
    println("The answer is: $multiply")
    println("The answer is: ${Eleven.divide(3, 4)}")


}

fun sum(i: Int, j: Int): Int {
    return i + j
}

fun minus(i: Int, j: Int): Int {
    return i - j
}