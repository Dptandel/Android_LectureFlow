package BackUp_Kotlin

//DAY 1

fun main(){
    var age: Int = 23
    var name = "Dharmin Tandel"
    var intro = "My name is"
    println("Hello, $intro $name and I'm $age years old.")

    var n1 = 25
    var n2 = 45
    println("Addition of $n1 and $n2 : ${n1+n2}")

    print("Enter name: ")
    var username = readln()

    print("Enter your age: ")
    var userage = readln().toInt()

    println("Hi, $username. You are $userage years old...!")

    userage += 10
    println("After 10 yrs your age will be ${userage+10} yrs.")

    println(n1++)
    println(n1)

    var n3 = 4    // 0100
    var n4 = 6    // 0110

    println(n3 and n4)

    /* Write a program that calculates and prints the area and perimeter of a rectangle given its length and width.
    Use appropriate variables and arithmetic operators. */

    println("Enter Length of Rectangle: ")
    var length: Double = readln().toDouble()

    println("Enter Width of Rectangle: ")
    var width: Double = readln().toDouble()

    var area = length * width
    var perimeter = 2 * (length + width)

    println("Area of Rectangle : $area and Perimeter of Rectangle: $perimeter.")

    /*Write a program that converts a temperature from Celsius to Fahrenheit. Use the formula F = C * 9/5 + 32.*/

    print("Enter Temperature in C: ")
    var tempC: Float = readln().toFloat()

    var tempF = (tempC * 9) / 5 + 32

    println("Temp in C : $tempC and Temp in F : $tempF")

    /*Write a program that swaps the values of two variables using a third variable.*/

    var a = 25
    var b = 35
    var temp = 0

    println("Before Swap: a = $a and b = $b")

    temp = a
    a = b
    b = temp

    println("After Swap: a = $a and b = $b")

}