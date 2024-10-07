package Learn_Kotlin

// DAY 12

// Set, Map, Companion Object

class UserData(val name:String, val contact:String, val city:String) {
    companion object {
        private var state = "Gujarat"
        private var district = "Navsari"

        fun getState(): String{
            return state
        }

        fun getDistrict(): String{
            return district
        }
    }
}

fun main() {

    // Set
    val setColors = mutableSetOf("Red","Green","Blue")

    setColors.forEach{
        println(it)
    }

    println("**************************************")

    val setOfRainbowColor = setOf("Violet","Indigo","Blue","Green","Yellow","Orange","Red")

    println("Rainbow Colors: $setOfRainbowColor")

    println("**************************************")


    //Map
    val names = mapOf("first_name" to "Dharmin","middle_name" to "Pankajkumar","last_name" to "Tandel")

    /*names.keys.forEach{
        println(it)
    }*/

    names.values.forEach{
        println(it)
    }

    println("**************************************")

    val userDetails = mutableMapOf("username" to "Dptandel", "password" to "Dharmin@02")

    userDetails.entries.forEach{
        println("${it.key} : ${it.value}")
    }

    println("**************************************")

    //Companion Object

    val user1 = UserData("Dharmin","9328356264","Bilimora")

    println("*********** User Details ***********")

    println("Name : ${user1.name}")
    println("Contact : ${user1.contact}")
    println("City : ${user1.city}")
    println("District : ${UserData.getDistrict()}")
    println("State : ${UserData.getState()}")

    println("**************************************")

}