fun main(args: Array<String>) {

    // Extension function
    // simply can extend predefined classes or own class
    val stringOne: String = "foo "
    val stringTwo: String = "bar"
    val stringThree: String = "Hi "
    println(stringThree.add(stringOne, stringTwo))
    val i: Int = 3
    val j: Int = 4
    val k = i.greaterValue(j)
    println(k)

}

// add function to String class
// remove this keyword and test :)
fun String.add(s1: String, s2: String): String {
    return this + s1 + s2
}

// greaterValue is extension function of Int class
fun Int.greaterValue(input: Int): Int {
    if (this > input) {
        return this
    } else {
        return input
    }
}