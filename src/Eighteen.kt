// Secondary Constructor

fun main(args: Array<String>) {

    val catOne = pet("Lucky")
    val catTwo = pet("Lucy", "Brown")
    println(catTwo.colour)

}

class pet(var name: String) {
    var colour: String = "Ginger"

    // pet class with primary constructor with 1 property
    init {
        println("My pet name is $name and colour is ${this.colour}")
    }

    // second constructor
    // can't declare with property likes primary constructor
    constructor(name: String, colour: String) : this(name) {
        this.colour = colour
    }

}