fun main(args: Array<String>) {

    // Ranges

    // This range contains the number 1 to 8
    val numOne = 1..8
    // This range contains the number 8 to 1
    val numTwo = 8 downTo 1
    // This range contains the number 8, 6, 4, 2
    val numThree = 8 downTo 1 step 2
    // This userName contains a to z
    val userName = 'a'..'z'
    // check h in userName, return true if present, otherwise false
    val isIncluded = 'h' in userName
    // 8 to 1
    val countDown = 8.downTo(1)
    // 1 to 8
    val upTo = 1.rangeTo(8)

}