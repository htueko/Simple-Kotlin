// Collection part 2

fun main(args: Array<String>) {

    // Map
    // (key - value )pair
    // immutable, fixed in size, READ ONLY

    val myMap = mapOf<String, String>(
            "oracle" to "An authoritative person who divines the future",
            "parameter" to "A reference or value that is passed to a function", "execute" to "Carry out an action"
    )// here is the mapOf String typed key and String typed value
    // oracle, parameter and execute are keys rest are value
    // key value pair is likes dictionary and phone book

    // print out the kwy in myMap
    for (key in myMap.keys) {
        println(key)
    }

    // print out the myMap
    for (entry in myMap) {
        println(entry)
    }

    // print out the value of myMap
    for (value in myMap.values) {
        println(value)
    }

    println("***** HashMap *****")
    // HashMap
    // Mutable, Not fixed in size, READ and WRite ( add and remove )

    // HashMap of key typed Int and value typed String named myHashMap
    val myHashMap = HashMap<Int, String>()
    myHashMap.put(1, "Bob")
    myHashMap[10] = "Steve" // alternative syntax
    myHashMap.put(20, "Gate")
    // print out the key
    for (key in myHashMap.keys) {
        println(key)
    }

    // remove
    myHashMap.remove(1, "Bob")
    // test
    println("----------")
    for (key in myHashMap.keys) {
        println(key)
    }

    // replace
    myHashMap.replace(10, "Inside out")
    // print out the value
    for (value in myHashMap.values) {
        println(value)
    }


}