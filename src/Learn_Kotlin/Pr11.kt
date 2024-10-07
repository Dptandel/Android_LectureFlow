package Learn_Kotlin

//DAY 10

//Exception Handling

fun main()
{
    try {
        divide(10, 0)

    } catch (ex : Exception) {
        println(ex.message)
    } finally {
        println("DIVIDE IS NOT POSSIBLE")
    }
}

fun divide(a : Int, b : Int)
{
    if (b == 0) {
        throw Exception("Divide by zero is not possible...!")
    } else {
        println("Division is : ${a/b}" )
    }
}
