// inheritance
// overriding
// all classes are public and final by default
// single inheritance, multi implementation
// "Any Class" is the topmost class in kotlin

fun main(args: Array<String>) {

    val dog = Dog()
    dog.name = "White Ball"
    dog.age = 4
    dog.breed = "labra"
    dog.color = "White"
    dog.eat()
    dog.move()
    dog.bark()
    println(dog.toString())

    val cat = Cat()
    cat.name = "Lucky"
    cat.age = 2
    cat.breed = ""
    cat.color = "Ginger"
    println(cat.toString())
    cat.eat()
    cat.move()
    cat.meow()

    val fish = Fish()
    fish.name = "Fishy"
    fish.breed = "Discuss"
    fish.color = "Red spot"
    fish.age = 3
    fish.move()
    fish.eat()
    fish.hasFin = true
    fish.move()

}

// public class Animal in java
// must add open keyword to extend
open class Animal {
    // Property of Animal class ( field variable in java )
    // Property are public as default in kotlin
    var name: String = ""
    var age: Int = 0
    var breed: String = ""
    var color: String = ""

    // function eat ( method in java)
    // ready to override coz of open keyword
    open fun eat() {
        println("Animal is eating")
    }

    // function move
    // ready to override coz of open keyword
    open fun move() {
        println("Animal is moving")
    }

    // override function toString() from Any Class
    override fun toString(): String {
        return "Animal(name='$name', age=$age, breed='$breed', color='$color')"
    }


}

// public final class Dog extends Animal in java
class Dog : Animal() {

    // bark() is the member function of Dog
    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super.eat() // return Animal is eating
        println("Dog is eating") // return Dog is eating
    }

    override fun move() {
        // super.move() // now only Dog is moving will return
        println("Dog is moving")
    }
}

class Cat : Animal() {

    // meow() is the member function of Cat
    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("Cat is eating")
    }

    override fun move() {
        println("Cat is moving")
    }
}

class Fish : Animal() {
    // property of Fish class
    var hasFin: Boolean = false

    // override eat() function of Animal class
    override fun eat() {
        println("Fish is eating")
    }

    // override move() function of Animal class
    // will return "Fish is swimming if hasFin property is set to true"
    // otherwise "This fish can't swim without fin will return"
    override fun move() {
        if (hasFin) {
            println("Fish is swimming")
        } else {
            println("This fish can't swim without fin")
        }
    }
}