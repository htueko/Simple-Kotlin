// Class, init block and primary constructor

fun main(args: Array<String>) {

    val bob = Person("Bob")
    val tobby = PersonAlternative("Tobby")
}

class Person(name: String) {
    // Person class with the primary constructor with 1 param
    init {
        println("My name is $name")
    }

}

class PersonAlternative(val name: String) {
    // PersonAlternative class with primary constructor with 1 property ( field in java )
    init {
        println("My alternative name is $name")
    }
}