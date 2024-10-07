package Learn_Kotlin

//DAY 6

open class User{

    // function overloading
    fun show(id:Int){
        println("id : $id")
    }

    fun show(id:Int, name:String){
        println("id : $id\nname : $name")
    }

    fun show(id:Int, name:String, email:String){
        println("id : $id\nname : $name\nemail : $email")
    }

    // function overriding
    // overridden method
    open fun concat(str1: String, str2: String): String {
        return "$str1 $str2"
    }

}

class MyString : User() {

    // overriding method
    override fun concat(str1: String, str2: String): String {
        println("full name : ${super.concat(str1, str2)}")
        return "${str1[0].uppercase()}${str1.substring(1).lowercase()} ${str2[0].uppercase()}${str2.substring(1).lowercase()}"
    }

}

fun main() {

    var obj1 = User()
    obj1.show(34)
    println("*****************")
    obj1.show(34, "Keval")
    println("*****************")
    obj1.show(34, "Keval", email = "keval@gmail.com")

    var name = "Dharmin"        // Object of String class

    println("equals : ${name.equals("DHARMIN")}")
    println("equalsIgnoreCase : ${name.equals("DHARMIN", ignoreCase = true)}")


    var obj2 = MyString()
    var fullName = obj2.concat("dHarMin", "TAnDel")
    println("name : $fullName")
}