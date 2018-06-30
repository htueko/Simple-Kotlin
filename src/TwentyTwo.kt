// Abstract class, abstract function and abstract properties
// abstract are open by default, so don't needed to add open keyword
// only abstract class can have abstract function and abstract properties
// abstract classes can have public and final normal classes and properties
// abstract classes can have open, private and internal functions and properties
// abstract properties and function must implement in child classes
// abstract functions and properties shouldn't implement in parent class
fun main(args: Array<String>) {

    val primaryStudent = PrimaryStudent()
    primaryStudent.name = "Bob"
    primaryStudent.goToLibrary()
    primaryStudent.goToParty()
    primaryStudent.goToSchool()

}

abstract class Student {
    abstract var name: String


    // public and final as default
    fun goToLibrary() {
        println("Go to Library and do something")
    }

    // open function, ready to override
    // optional open function, it's depend to override or not
    open fun goToSchool() {
        println("Go to School")
    }

    // abstract function, empty code body at parent classes
    // must implement at child classes
    abstract fun goToParty()

}

class PrimaryStudent : Student() {
    override var name: String = ""

    override fun goToParty() {
        println("Too soon for primary student")
    }

    override fun goToSchool() {
        super.goToSchool() // optional
        println("Go to primary school")
    }


}