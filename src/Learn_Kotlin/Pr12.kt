package Learn_Kotlin

// DAY 11

// Kotlin Collections (List)

// Task of "Menu Driven program of add, update and remove, etc.".

fun main() {
    val colorList = mutableListOf<String>()

    while (true) {
        println("""
            
            *** COLOR PROGRAM ***
            1. Add a Color
            2. Update a Color
            3. Remove a Color
            4. Exit
            
        """.trimIndent())

        print("Enter a choice: ")
        val choice = readln().toInt()

        when (choice) {
            1 -> {
                print("Enter a color to Add: ")
                val colorAdd = readln()

                if (colorList.contains(colorAdd)) {
                    println("Color ($colorAdd) is already in the colors.")
                } else {
                    colorList.add(colorAdd)
                    println("Color ($colorAdd) is added to the colors.")
                }
                println("Colors: $colorList")
            }

            2 -> {
                print("Enter the color you want to update: ")
                val colorToUpdate = readln()

                if (colorList.contains(colorToUpdate)) {

                    print("Enter a color to Update: ")
                    val colorUpdate = readln()

                    if (colorList.contains(colorUpdate)){
                        println("Color you want to update ($colorUpdate) on ($colorToUpdate) is already exist.")
                    } else {
                        val i = colorList.indexOf(colorToUpdate)
                        colorList[i] = colorUpdate

                        println("Color ($colorToUpdate) is updated successfully to ($colorUpdate) in colors.")
                    }
                } else {
                    println("Color ($colorToUpdate) does not exist in colors.")
                }

                println("Colors: $colorList")
            }

            3 -> {
                print("Enter color that you want to remove: ")
                val colorToRemove = readln()

                if (colorToRemove in colorList) {
                    colorList.remove(colorToRemove)
                    println("Color ($colorToRemove) has been removed.")
                } else {
                    println("Color ($colorToRemove) does not exist in colors.")
                }

                println("Colors: $colorList")
            }

            4 -> {
                println("!!! Thank you for using COLOR PROGRAM !!!")
                break
            }

            else -> {
                println("Invalid choice. Please enter a choice between 1 and 4.")
            }
        }
    }
}