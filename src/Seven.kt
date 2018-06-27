fun main(args: Array<String>) {

    // break, continue
    // break
    for (i in 1..8) {
        println(i)
        if (i == 4) break // 1,2,3,4
    }

    loop@ for (i in 1..4) { // outer for loop
        for (j in 1..4) { // inner for loop
            println("$i $j")
            if (i == 2 && j == 2) break@loop
        }
    }
//    1 1
//    1 2
//    1 3
//    1 4
//    2 1
//    2 2

    // continue
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i) // odd number
        // 1,3,5,7,9
    }

    for (i in 1..4) {
        innerLoop@ for (j in 1..4) {
            if (i == 2 && j == 2) {
                continue@innerLoop
            }
            println("$i $j")
        }
    }
//    1 1
//    1 2
//    1 3
//    1 4
//    2 1
//    2 3
//    2 4
//    3 1
//    3 2
//    3 3
//    3 4
//    4 1
//    4 2
//    4 3
//    4 4

}