package BackUp_Kotlin

//DAY 4

open class Products(var pId:Int, var brand:String, var desc:String, var rating:Float, var mrp:Double, var disAmount:Double,
                    var sizes: String)

class ProductDetails(pId:Int, brand:String, desc:String, rating:Float, mrp:Double, disAmount:Double, sizes:String)
    : Products(pId, brand, desc, rating, mrp, disAmount, sizes ) {

    fun getSalePrice() : Double {
        return mrp - disAmount
    }

    fun display(){
        println("""
            Product ID : $pId
            Brand : $brand
            Description : $desc    
            Sizes : $sizes
            Rating : $rating    
            MRP : $mrp      
            Discount : $disAmount   
            Sale price : ${getSalePrice()}
        """.trimIndent())
    }
}

fun main() {

    var p1 = ProductDetails(1, "MOD ECRU", "Unisex Printed T-shirt", 0.0f, 1299.0, 550.0, "7XL, XL, 3XL")

    p1.display()

}