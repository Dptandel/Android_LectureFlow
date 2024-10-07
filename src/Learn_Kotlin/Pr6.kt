package Learn_Kotlin

//DAY 5

class PersonDetails {
    var fname = ""
        get() = field
        set(firstName) {
            field = firstName.uppercase()
        }
    var mname = ""
        get() = field
        set(middleName) {
            field = middleName.uppercase()
        }
    var lname = ""
        get() = field
        set(lastName) {
            field = lastName.uppercase()
        }
}

fun main() {
    var person1 = PersonDetails()
    person1.fname = "Dharmin"
    person1.mname = "Pankajkumar"
    person1.lname = "Tandel"

    println("${person1.fname} ${person1.mname} ${person1.lname}")
}