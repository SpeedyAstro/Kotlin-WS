fun main(){
    var name : String = "sky"
//    name = null -> Compilation Error
    var nullableName : String? = "bird"
    nullableName = null

    // Difference
    var len = name.length
//    var len2 = nullableName.length  - it can't accept this statement hence it is type of nullable string
    // below condition check if nullableName is null or not
//    if (nullableName!=null){
//        var len2 = nullableName.length
//    }else{
//        null
//    }
    // instead of this kotlin provide this feature
    var len2 = nullableName?.length  // this line make sure that nullableName is not null ,
    // so once defined safe call operator (?) we need to use it everytime with nullableName in operations
//    print(len2)
//    print(nullableName)

    nullableName?.let { println(nullableName.length) } // this statement don't run until length is not null
    val name2 = nullableName?: "Water"  // this statement define "if nullableName is null than assign "water" in name2

    // elvis operator
    // we use elvis operator if programmer is 100% sure for the string is not null
    name2!!.uppercase()
    print(name2!!.uppercase())
    val user = 0
    // val wifeAge : String? = user?.wife?.age ? : 0
}