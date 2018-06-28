fun main(args: Array<String>) {

    // Function
    // sample function ( method in java )
    // fun is the function keyword
    // sum is the function name
    // numOne and numTwo are Parameters
    // : Int is return type
    // default is : Unit ( Void in java )
//    fun sum(numOne: Int, numTwo: Int): Int{
//        return numOne + numTwo
//    }

    add()
    subtract(3, 4)
    val multiply = multiply(3, 4)
    println("Answer is $multiply")
    divide(3, 4)
}

fun add() {
    var i = 3
    var j = 4
    println("Sum of $i and $4 is: ${i + j}")
}

fun subtract(numOne: Int, numTwo: Int): Int {
    return numOne - numTwo
}

fun multiply(numOne: Int, numTwo: Int): Int {
    return numOne * numTwo
}

fun divide(numOne: Int, numTwo: Int) {
    val divide = numOne / numTwo
    println("Answer of $numOne and $numTwo is $divide")
}