// .filter
// .map


fun main(args: Array<String>) {

    // .filter
    // listOf integer
    val numbers = listOf<Int>(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    // filter listOf integer named numbers (smaller than 10 here ) and assign to variable numbersSmall
    val numbersSmall = numbers.filter { it < 20 }
    // print out
    for (number in numbersSmall) {
        println(number)
    }

    println("**********")

    // .map
    // numbers.map{ it * it } = check the output to clearly understand
    val anotherSquareNumber = numbers.map { it * it }
    for (number in anotherSquareNumber) {
        println(number)
    }

    println("***** simple syntax *****")
    val squareAndSmall = numbers.filter { it < 5 }.map { it * it }
    for (number in squareAndSmall) {
        println(number)
    }

    // another example to understand clearly
    // listOf Pets ( here is 3 ) and assign into pet
    val pet = listOf<Pets>(Pets("lucky", 2),
            Pets("White Fur", 3), Pets("Brown", 5))
    // get the name of pet listOf and assign to names
    val names = pet.map { it.name }
    // print out
    for (name in names) {
        println(name)
    }
    println("**********")
    // filter the name start with "W" from pet listOf and assign to nameWith
    val namesWith = pet.filter { it.name.startsWith("W") }.map { it.name }
    // print out
    for (name in namesWith) {
        println(name)
    }

}

// simple class named Pets with name and age
class Pets(var name: String, var age: Int)

