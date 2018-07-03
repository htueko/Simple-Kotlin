// Collection part 3

fun main(args: Array<String>) {

    // set
    // Immutable, READ ONLY
    // unique ( not accept duplicate value )

    // Immutable setOf typed integer named mySet
    val mySet = setOf<Int>(12, 34, 56, 78, 90, 91, 12, 34, 56, 65)
    // print out
    for (item in mySet) {
        println(item) // 12, 34, 56, 78, 90, 91, 65 ( no more duplicate )
    }

    println("***** Mutable setOf *****")
    // mutable setOf
    // mutable, READ and WRIT

    val myMutableSetOf = mutableSetOf<Int>(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val myMutableSetOfSize = myMutableSetOf.size
    myMutableSetOf.forEach { println(myMutableSetOf.toString()) }
    println(myMutableSetOfSize)
    myMutableSetOf.add(20)
    myMutableSetOf.remove(2)
    for (item in myMutableSetOf) {
        println(item)
    }

    println("***** HashSet *****")
    // hashSetOf
    // same as set but not ensure in output

    val myHashSetOf = hashSetOf<Int>(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    for (item in myHashSetOf) {
        println(item)
    }

}