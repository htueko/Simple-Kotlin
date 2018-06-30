// inheritance with primary and secondary constructor
// parent class or base class or super class ( same )
// child class or derived class or sub class ( same )

fun main(args: Array<String>) {

    val moderHouse = ModernHouse(2010, "Technicolour", "Bob", "Steve")
    println(moderHouse.currentOwner)
    println(moderHouse.buildYear)
    println(moderHouse.paintColor)
    println(moderHouse.previousOwner)
    moderHouse.hasLivingStandard()
    moderHouse.hasFreeSpace = true
    moderHouse.hasLivingStandard()

}

// open class House with primary constructor and property variables
// parent class or base class or super class ( same )
// House class is the parent class of ModernHouse class
open class House() {
    var buildYear: Int = 0
    var paintColor: String = ""
    var currentOwner: String = ""
    var previousOwner: String = ""

    constructor(buildYear: Int, paintColor: String, currentOwner: String, previousOwner: String) : this() {
        this.buildYear = buildYear
        this.paintColor = paintColor
        this.currentOwner = currentOwner
        this.previousOwner = previousOwner
    }
}

// ModernHouse extends House class
// child class or derived class or sub class ( same )
// ModernHouse class is the child class of House class
class ModernHouse(buildYear: Int, paintColor: String, currentOwner: String, previousOwner: String) :
        House(buildYear, paintColor, currentOwner, previousOwner) {

    // field or member variable of ModernHouse class
    // hasFreeSpace is public
    var hasFreeSpace: Boolean = false
    // private field
    private var hasGarden: Boolean = false
    // private field
    private var hasSwimmingPool: Boolean = false
    // private field
    private var hasIndoorGym: Boolean = false

    fun hasLivingStandard() {
        // if hasFreeSpace variable is set to true
        // code from if block will execute
        // if hasFreeSpace variable is set to false ( as default looks above)
        // code from else block will execute
        if (hasFreeSpace) {
            hasGarden = true
            hasSwimmingPool = true
            hasIndoorGym = true
            println("Wow Garden, Swimming pool and Gym hooray!!")
        } else {
            println("There's is no space for Garden, Swimming pool and Gym")
        }
    }

}

class NormalHouse : House {

    private var isAvailableToLive: Boolean = false

    constructor(buildYear: Int, paintColor: String, currentOwner: String, previousOwner: String, isAvailableToLive: Boolean) : super(buildYear, paintColor, currentOwner, previousOwner) {
        this.isAvailableToLive = isAvailableToLive
    }
}