fun main(args: Array<String>) {

    // Named Parameters
    brand("scar face", 1280, "Make up")
    brand(est = 1960, name = "Demolish", produced = "TNT")

}

fun brand(name: String, est: Int, produced: String) {
    println("Name is $name")
    println("est since $est")
    println("Produced $produced with pride")
}