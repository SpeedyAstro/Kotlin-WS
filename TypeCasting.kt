import kotlin.math.floor

fun main(){
    // A List of String only
    val stringList : List<String> = listOf("Denis" , "Randy" , "Davis" , "Mia" , "Garry")
    // A Mixed List
    val mixedList : List<Any> = listOf("Denis" , "Groovy" , 29 , 60.60 , "Weight" , "Kg" , 'X')
    // Iterating through the mixed list
//    for (value in mixedList) {
//        if(value is Int){
//            print("Integer : $value")
//        } else if (value is Double){
//            println("Double : $value with floor value : ${floor(value)}")
//        } else if (value is String){
//            println("String : $value of length : ${value.length}")
//        } else {
//            print("Unknown Type")
//        }
//    }
    for (value in mixedList) {
        when (value) {
            is Int -> print("Integer : $value")
            is Double -> println("Double : $value with floor value : ${floor(value)}")
            is String -> println("String : $value of length : ${value.length}")
            else -> print("Unknown Type : $value")
        }
    }

// Explicit typecasting using "as" can go wrong
    val ob2 : Any = 1337
    //val str2 : String = ob2 as String     // does not work
    //print(str2)
// Explicit (Safe) typecasting using the "as?" keyword
    val ob3 : Any = 1337
    val str2 : String? = ob3 as? String    // does work
    print(str2)
}