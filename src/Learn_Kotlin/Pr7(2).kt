package Learn_Kotlin

//DAY 6

abstract class Items( protected var name: String, protected var price: Double ) {
    abstract fun calculatePrice()

    fun displayName() {
        println("Product name: $name")
    }
}

class Electronics(name: String, price: Double, private var warrantyInYears: Int) : Items(name, price) {

    override fun calculatePrice() {
        val salePrice = price + (price * 0.10 + warrantyInYears)
        println("Base price: $price")
        println("Sale price: $salePrice\n")
    }
}

class Clothes( private var material: String, name: String, price: Double ) : Items(name, price) {

    override fun calculatePrice() {
        val materialAmount = if (material == "cotton") 99 else 49
        val salePrice = price + materialAmount
        println("Base price: $price")
        println("Sale price: $salePrice")
    }
}

fun main() {
    val ob1 = Electronics("Mobile", 54000.0, 2)
    ob1.displayName()
    ob1.calculatePrice()

    val ob2 = Clothes("cotton", "T-shirt", 600.0)
    ob2.displayName()
    ob2.calculatePrice()
}
