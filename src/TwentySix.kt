// Companion Object
// same as object but declare within a class
// don't needed to named
// if you wanna called from java used @JvmStatic

fun main(args: Array<String>) {
    // call the companion object of class AClass
    AClass.name = "Bob"
    AClass.age = 30
    AClass.aCompanionObjectFunction()

}

class AClass {
    companion object {
        var name: String = ""
        var age: Int = -1
        fun aCompanionObjectFunction() {
            // some code here
        }
    }
}