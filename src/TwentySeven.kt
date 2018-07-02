// High Level Functions and Lambdas

// High Level Functions
// functions as parameters
// return a function
// or both

// Lambdas
// function without name


fun main(args: Array<String>) {
    // created simpleProgram object from SimpleProgram class
    val simpleProgram = SimpleProgram()
    // function of SimpleProgram class
    simpleProgram.sumTwoNumbers(3, 4)
    // Function of SimpleProgram class with interface
    // implemented the interface
    // new JustInterface ( way of java )
    // object: JustInterface ( way of kotlin, there is no new keyword in kotlin)
    // override the function run
    simpleProgram.sumTwoNumbers(3, 4, object : JustInterface {
        override fun run(i: Int) {
            println(i)
        }
    })

    val simpleLambda: (Int, Int) -> Int = { i: Int, j: Int -> i + j }
    // simply called the high level function with lambda as param
    simpleProgram.sumTwoNumbers(3, 4, simpleLambda)

    // another and most used way of lambda
    simpleProgram.sumTwoNumbers(3, 4) { i, j -> i + j }

}


class SimpleProgram {

    // High level function, lambda as param
    // act function accept two Int and return Int
    // otherwise accept i and j and return in this function
    fun sumTwoNumbers(i: Int, j: Int, act: (Int, Int) -> Int) {
        val result = act(i, j)
        println(result)
    }

    // High level function
    fun sumTwoNumbers(i: Int, j: Int, act: JustInterface) {
        val result = i + j
        act.run(result)
    }

    // normal function
    fun sumTwoNumbers(i: Int, j: Int) {
        val result = i + j
        println(result)
    }

}

// interface JustInterface
// just a function with no cody body
// implemented when used this interface
// check interface for further info
interface JustInterface {
    fun run(i: Int)
}

