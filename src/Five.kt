fun main(args: Array<String>) {

    // Conditional expressions

    // if else
    val numOne: Int = 18
    val numTwo: Int = 20
    val numThree: Int = 12
    if (numOne <= numTwo) {
        if (numOne >= numThree) {
            println("$numOne is smaller than $numTwo, but greater than $numThree")
        }
    } else if (numTwo >= numOne) {
        println("$numTwo is greater than $numThree")
    } else {
        println("Other")
    }

    // When
    when (numOne) {
        1 -> println("$numOne is 1")
        2 -> println("$numOne is 2")
        3 -> println("$numOne is 3")
        4 -> println("$numOne is 4")
        5 -> println("$numOne is 5")
        else -> println("$numOne is not in the when conditional code!!")
    }

    val string: String
    when (numOne) {
        1 -> string = "someone"
        2 -> string = "anyone"
        3 -> string = "noone"
        else -> string = "everyone"
    }

}