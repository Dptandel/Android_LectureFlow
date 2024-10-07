package Learn_Kotlin

// DAY 14

// Kotlin Scope Function like .apply{}

class Animal {
    var name: String = ""

    constructor() {}

    constructor(name: String) {
        this.name = name
    }
}

fun main() {

    val fruitsList = mutableListOf<String>()

    val fruits = mutableListOf("Apple", "Grapes", "Pineapple")

    fruitsList.apply {
        add("Mango")
        add("Banana")
        addAll(fruits)
    }

    println("Fruits: $fruitsList")

    Animal().apply {
        name = "Monkey"
        println("Name: $name")
        println("Food: ${fruitsList[1]}")
    }
}