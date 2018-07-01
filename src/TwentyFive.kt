// Object
// static in java
// Kotlin don't have static variable and static function to declare
// but declare object as class
// Object can called without created instance

object People {

    // static variable in java
    var age: Int = -1

    // static method in java
    fun haveFun() {

    }

}

class PeopleData {
    var name: String = ""
    var age: Int = -1
    fun isHuman(): Boolean {
        return !(name.isEmpty() && age == -1)
    }
}

fun main(args: Array<String>) {
    // called the People object
    // don't needed to created instance
    People.age = 30
    People.haveFun()

    val peopleData = PeopleData()
    peopleData.name = "Bob"
    peopleData.age = 30
    val human = peopleData.isHuman()


}