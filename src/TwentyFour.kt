// Data class


fun main(args: Array<String>) {

    // userOne object created from User class
    val userOne = User("Bob", 34)
    // userTwo object created from User class
    val userTwo = User("Bob", 34)

    println(userOne)
    println(userTwo)

    // compare userOne and userTwo
    // same value but different reference
    // so output will be "Not equal"
    if (userOne == userTwo) {
        println("Equal")
    } else {
        println("Not equal")
    }

    // dataUserOne object created from DataUser class
    val dataUserOne = DataUser("Bob", 34)
    // dataUserTwo object created from DataUser class
    val dataUserTwo = DataUser("Bob", 34)

    println(dataUserOne)
    println(dataUserTwo)

    // compare dataUserOne and dataUserTwo
    // same value but different reference
    // but output will be "Equal" coz data class compare value not reference
    if (dataUserOne == dataUserTwo) {
        println("Equal")
    } else {
        println("Not equal")
    }
    // copy method of data class
    val dataUserThree = dataUserOne.copy()
    println(dataUserThree)
    val dataUserFour = dataUserTwo.copy(name = "Steve")
    println(dataUserFour)
    val dataUserFive = dataUserFour.copy(id = 100)
    println(dataUserFive)
    val dataUserSix = dataUserFive.copy(name = "Bob", id = 34)
    println(dataUserSix)

}

class User(var name: String, var id: Int)

// data class named DataUser
// data class primary constructor must have only property (val / var ) parameter
data class DataUser(var name: String, var id: Int)