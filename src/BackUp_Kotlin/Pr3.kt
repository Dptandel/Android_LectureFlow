package BackUp_Kotlin

//DAY 2

class Product {
    var pName = ""
    var pId = 0
    var pDesc = ""
    var pPrice = 0.0
    var pDiscount = 0.0f

    fun getSellPrice() : Double {
        return pPrice - pDiscount
    }

    fun setData(pName:String, pId:Int, pDesc:String, pPrice:Double, pDiscount:Float) {
        this.pName = pName
        this.pId = pId
        this.pDesc = pDesc
        this.pPrice = pPrice
        this.pDiscount = pDiscount
    }

    fun Display() {
        print("""
            Product ID : $pId
            Product Name : $pName
            Product Description : $pDesc
            Product MRP : $pPrice
            Product Discount : $pDiscount
            Product Price : ${getSellPrice()}
        """.trimIndent())
    }
}

fun main() {

    var p1 = Product()
    p1.pName = "H&M"
    p1.pId = 111
    p1.pDesc = "Men Ribbed Polo Shirt"
    p1.pPrice = 2299.0
    p1.pDiscount = 0.0f

    var p2 = Product()
    p2.setData(
        pName = "MOD ECRU",
        pId = 222,
        pDesc = "Unisex Typography Printed T-shirt",
        pPrice = 1299.0,
        pDiscount = 550.0f
    )
    p1.Display()
    p2.Display()
}