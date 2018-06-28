fun main(args: Array<String>) {

    // function with expression
    val maxNumber = max(3, 4)
    println("The answer is $maxNumber")
    min(3, 4)
}

// max function accept 2 integer numbers and return bigger number
fun max(numOne: Int, numTwo: Int): Int = if (numOne > numTwo) numOne else numTwo

// min function accept 2 integer numbers and return smaller number
fun min(numOne: Int, numTwo: Int): Unit =
        if (numOne > numTwo) {
            println("$numTwo is smaller")
        } else {
            println("$numOne is smaller")
        }