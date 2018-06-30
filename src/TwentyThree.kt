// interface
// properties of interface classes don't needed to initialize
// also properties of interface are abstract and open by default, so don't needed abstract modifier but not final this is important
// interface is not class, so don't have constructor
// functions in interface are abstract and open by default


fun main(args: Array<String>) {

    val myButton = Button("Enter")
    // onClick() function will called from Button class
    myButton.onClick()
    // onSelected() function will called from MyInterface interface, coz I don't override this function within Button class
    myButton.onSelected()

}

interface MyInterface {
    // properties of interface classes don't needed to initialize
    // also properties of interface are abstract and open by default, so don't needed abstract modifier
    var name: String

    // looks likes normal function but look carefully there is no cody body
    fun onClick()

    // nor name function with code block, remember abstract don't have code body
    fun onSelected() {
        // some code here
        println("Selected event is happened")
    }

}

// class Button implement MyInterface in java
// override abstract variable name as property with constructor
// optional to override within constructor, can override within code body too
class Button(override var name: String) : MyInterface {
    override fun onClick() {
        println("$name click event is happened")
    }
}