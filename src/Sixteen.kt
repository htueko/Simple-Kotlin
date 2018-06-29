import java.math.BigInteger

fun main(args: Array<String>) {

    // TailRec Function ( Recursive Function )
    // have prefix tailrec
    // prevents stack overflow exception

    // overtime this function will throw java.lang.StackOverflowError
    // test to input n = 1000
    println(getFiboonacci(20, BigInteger("1"), BigInteger("0")))

    // tailrec function
    println(getFiboonacciNumber(1000, BigInteger("1"), BigInteger("0")))

}

fun getFiboonacci(n: Int, i: BigInteger, j: BigInteger): BigInteger {
    // 0 1 1 2 3 5 8 13 21 33 54.......
    return if (n == 0) j
    else getFiboonacci(n - 1, i + j, i)
}

// tailrec function
tailrec fun getFiboonacciNumber(n: Int, i: BigInteger, j: BigInteger): BigInteger {
    // 0 1 1 2 3 5 8 13 21 33 54.......
    return if (n == 0) j
    else getFiboonacciNumber(n - 1, i + j, i)
}