package Learn_Kotlin

//DAY 9

class PyramidPattern {

    //Infix function
    infix fun pyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}

fun main() {
    var p1 = PyramidPattern()
    p1 pyramid 6

    println()

    var sum = { num1: Int, num2: Int ->
        println("sum of $num1 and $num2 = ${num1 + num2}")
    }

    anotherFunction(36, 64, sum);
}

//Higher Order Function with Lambda function as parameter
fun anotherFunction(num1: Int, num2: Int, summation: (Int, Int) -> Unit) {
    summation(num1, num2)
}