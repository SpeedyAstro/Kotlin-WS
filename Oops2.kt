fun main(){
    var myCar = Car()
    myCar.maxSpeed = 10
}
class Car(){
    lateinit var owner: String
    var brand : String = "BMW"
        get() { // Custom getter
            return field.lowercase()
        }

    var maxSpeed : Int = 240
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Max speed cant be 0")
        }
        // This is default getter and setters
//        get() = field
//        set(value) {
//            field = value
//        }
    init {
        this.owner = "Frank"
    }

}