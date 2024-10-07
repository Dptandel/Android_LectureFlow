package Learn_Kotlin

//DAY 7

class Hotel(
    var name: String,
    var address: Address,
    var contact: Contact
)

class Contact(
    var telPhone: String,
    var mobile: String,
    var email: String
)

class Address(
    var city: String,
    var state: String,
    var pinCode: Int
)

fun main() {
    var h1 = Hotel(
        name = "Tasty Bites",
        address = Address(city = "Surat", state = "Gujarat", pinCode = 395002),
        contact = Contact(telPhone = "02615566554", mobile = "4444444444", email = "tastybites@gmail.com")
    )

    println(
        """
        name : ${h1.name}
        city : ${h1.address.city}
        state : ${h1.address.state}
        pinCode : ${h1.address.pinCode}
        telephone : ${h1.contact.telPhone}
        mobile: ${h1.contact.mobile}
        email: ${h1.contact.email}
    """.trimIndent()
    )
}