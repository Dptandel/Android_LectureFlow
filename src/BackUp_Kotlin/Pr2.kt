package BackUp_Kotlin

//DAY 1

fun main() {
    var age = 18

    print("Enter Age: ")
    var person_age = readln().toInt()

    if (person_age >= age){
        print("you are eligible for voting...!")
    } else {
        print("you are not eligible for voting...!")
    }

    // WAP to find out positive or negative number.

    var number = person_age

    var result = if(number > 0){
        "It is a positive number"
    }else{
        "It is a negative number"
    }

    println("result : $result")

//    Write a Kotlin program to check if a given character is a vowel or a consonant

    print("Enter Character to check it is vowel or not : ")
    var char = readln()

    when(char) {

        "A","E","I","O","U" -> print("Character $char is vowel.")

        else -> {
            println("Character $char is consonant.")
        }
    }

//    Write a Kotlin program to print the first 10 natural numbers.

    var num = 1
    while (num<=10){
        print("$num \t")
        num++
    }

    for(num in 1..10){
        print("$num\t")
    }

    println()

//    Pattern: Triangle

    for(i in 1..5){
        for(j in 1..i)
            print("*")
        println()
    }
}