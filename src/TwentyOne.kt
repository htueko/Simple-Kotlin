// Visibility Modifiers
// public ( Everything is public in kotlin as default )
// protected -> can't used as high level (fun or classes )
// internal -> belong to package
// private -> belong to class

fun main(args: Array<String>) {

}

private class One {
    // only visible to belonging class
}

private fun one() {
    // only visible to belonging class
}

internal class Two {
    // only visible to belonging package
}

internal fun two() {
    // only visible to belonging package
}

// Super class
open class Fruit {
    private var a: Int = 1
    protected var b: Int = 2
    internal var c: Int = 3
    var d: Int = 4 // public is default so don't needed to declare
}

// Sub class of Fruit
class Banana : Fruit() {
    // a is not visible
    // b is visible
    // c is visible
    // d is visible
}

class Apple {


    fun Orange() {
        val banana = Banana()
        // private variable a can't used in other classes
        //banana.a
        // protected variable b cant' used in other classes
        //banana.b
        // internal variable c can used within same package
        banana.c
        // public variable d will visible for all
        banana.d
    }
}
