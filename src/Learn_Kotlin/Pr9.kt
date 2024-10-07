package Learn_Kotlin

//DAY 8

// data class
data class Employee(var id: Int, var name: String, var department: String)

fun main() {

    var e1 = Employee(45, "Dharmin Tandel", "CE")
    var e2 = Employee(46, "Keval", "IT")

    println("equals : ${e1 == e2}")
    println("toString : $e1")

    // copy
    var e3 = e1.copy(department = "HR")
    println("e3 : $e3")

    // ComponentN
    println("id : ${e1.component1()}  name : ${e1.component2()}   department : ${e1.component3()}")

    // Destructuring Declarations
    val(id, name, department) = e1
    println("id : $id   name : $name   department : $department")

    var s1 = "Tops"
    var res = s1.plus(" Technologies Pvt. Ltd.")
    println(res)

    res = s1.concat(" Technologies", " is an leading IT Training Institute for learning and getting IT Skills.")
    println(res)

    var firstName = "DhArMiN"

    res = firstName.convertNameToCamel("tAnDel")
    println(res)
}

fun String.concat(str1: String, str2: String): String {
    return "$this$str1$str2"
}

fun String.convertNameToCamel(lastName: String): String {
    return "${this[0].uppercase()+this.substring(1).lowercase()} ${lastName[0].uppercase()+lastName.substring(1).lowercase()}"
}
