fun main(args: Array<String>) {

    // Loop
    // for loop
    for (i in 1..8) {
        print(i) // 1,2,...to 8
    }
    for (i in 8 downTo 1) {
        print(i) // 8,7,...to 1
    }
    for (i in 1..8 step 2) {
        print(i) // 1,3,5,7
    }
    for (i in 8 downTo 1 step 2) {
        print(i) // 8,6,4,2
    }
    for (i in 1 until 8) {
        print(i) // 1,2,..to7
    }

    // while loop
    var i: Int = 1
    while (i <= 8) {
        //println(i) // 1,2,..to 7
        i++
    }

    // do while loop
    i = 1
    do {
        println(i) // 1,2,..to 8
        i++
    } while (i <= 8)

}