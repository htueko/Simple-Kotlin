// Collections
// Immutable collections and Mutable collections
// Immutable collections, otherwise READ ONLY such as
// -> listOf, mapOf, setOf
// Mutable collections, otherwise READ and WRITE such as
// Mutable List -> ArrayList, arrayListOf, mutableListOf
// Mutable Map -> HashMap, hasMapOf, mutableMapOf
// Mutable Set -> mutableSetOf, hashSetOf

fun main(args: Array<String>) {

    // Array
    // mutable, fixed in size
    // user mainly if you know the how many you want exactly
    // array start from 0 not 1
    // myArray type integer have 4 box that contains 2 in each boy (English)
    var myArray = Array(4) { 2 }
    // 0 , 1, 2, 3 ( index )
    // 2, 2 , 2, 2 ( value )
    myArray[1] = 34 // put value 34 into the index ( or box ) number 1
    println(myArray[3]) // output will be 2
    println("**** Array *****") // just for visual aide
    //println(myArray[4]) // no error but will be error at runtime
    // ArrayIndexOutOfBoundsException error

    // to print out all value ( element ) from array
    for (item in myArray) {
        println(item) // print out all value in myArray
    }

    println("***** listOf *****")
    // listOf
    // immutable, fixed size, READ ONLY
    // here is String type listOf contains three value one, two and three
    // so index is 0, 1 and 2
    // other types also support eg Int, Double, Float. Also user defined types work too
    var myList = listOf<String>("One", "Two", "Three")
    // print out the myList
    for (item in myList) {
        println(item)
    }

    println("***** mutableListOf *****")
    // mutableListOf
    // Mutable, no fixed in size, READ and Write ( add or remove )
    // mutableListOf types integer with three values 1, 2 and 3
    val myMutableListOf = mutableListOf<Int>(1, 2, 3)
    // added another value 4
    // so index is 0,1,2,3
    myMutableListOf.add(4)
    // print out
    for (item in myMutableListOf) {
        println(item)
    }
    println("----------")
    // remove the value at index 2, for our case it's value 3
    myMutableListOf.removeAt(2)
    // print out
    for (item in myMutableListOf) {
        println(item)
    }
    println("----------")
    // remove the element 4
    myMutableListOf.remove(4)
    // print out
    for (item in myMutableListOf) {
        println(item)
    }
    println("----------")
    // add element (value) 20 at index 1
    myMutableListOf.add(1, 20)// myMutableListOf[1} = 20 ( alternative way )
    // print out
    for (item in myMutableListOf) {
        println(item)
    }

}
