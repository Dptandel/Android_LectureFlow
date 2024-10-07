package Learn_Kotlin

// DAY 12

//Task

data class UserContact(var userMobile: String, var userEmail: String)
data class UserAddress(var userStreet: String, var userCity: String, var userDistrict: String, var userState: String)
data class UserDetails( var userName: String, var userContact: UserContact, var userAddress: UserAddress)


fun main() {

    val userList = mutableListOf<UserDetails>()

    userList.add(UserDetails(
        "Dharmin Tandel",
        UserContact("9328356264","dharmin2002@gmail.com"),
        UserAddress("Mohanpark Society","Bilimora","Navsari","Gujarat")
    ))

    userList.add(UserDetails(
        "Fenil Tandel",
        UserContact("8849948336","fenil1999@gmail.com"),
        UserAddress("Mohanpark Society","Bilimora","Navsari","Gujarat")
    ))

    for (user in userList){
        println("Name: ${user.userName}")
        println("Mobile: ${user.userContact.userMobile} Email ID: ${user.userContact.userEmail}")
        println("Address: ${user.userContact.userEmail}, ${user.userAddress.userCity}, ${user.userAddress.userDistrict}, ${user.userAddress.userState}")
        println()
    }


}