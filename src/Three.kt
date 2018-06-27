fun main(args: Array<String>) {

    // String Interpolation

    val firstName: String = "Marg"
    val lastName: String = "Hope"
    // print out the name
    println("The name is: " + firstName + lastName)
    // alternative way ( kotlin way )
    println("The name is: $firstName $lastName")

    val firstNumber = 12
    val secondNumber = 21
    // ${}
    println("The sum of $firstName + $secondNumber is: ${firstNumber + secondNumber}")

}