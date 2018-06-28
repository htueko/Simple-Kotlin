fun main(args: Array<String>) {

    // Default function
    // function with default parameter

    // ballOne assign produceBall function with custom parameter
    val ballOne = produceBall("one", "two", "ISS")
    // ballTwo assign produceBall function with default name and model but custom country parameter
    val ballTwo = produceBall(country = "Easter island")

    // Noted that java doesn't support default functions
    // if you wanna used default functions from kotlin in java
    // you have to used @JvmOverloads

}

fun produceBall(name: String = "Flier", model: String = "World Cup Model", country: String): String {

    return println("Model $model is produced with name $name and made in $country").toString()

}
