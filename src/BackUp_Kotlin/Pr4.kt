package BackUp_Kotlin

//DAY 3

open class Person{
    var id : Int = 0
    var name : String = ""
    var m_no : Long = 0
}

class Student : Person(){

    var course = ""
    var fees = 0.0

    fun display(){
        println("""
            Student ID : $id
            Student Name : $name 
            Enrolled Course : $course
            Course Fees : $fees
            Mobile No. : $m_no
        """.trimIndent())
    }

}


fun main() {

    var student = Student()
    student.id = 2
    student.name = "Dharmin Tandel"
    student.course = "Kotlin"
    student.fees = 65000.0
    student.m_no = 9328356264

    student.display()

}