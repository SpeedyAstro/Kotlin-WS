fun main(){
    val numbers : IntArray = intArrayOf(1,2,3,4,5,6,7)
//    print(numbers)      // prints address
    println(numbers.contentToString())
    for (ele in numbers) println(ele)
    // Storing objects inside the array
    val fruits = arrayOf(Fruits("Mango" , 26) , Fruits("Apple" , 99))
    println(fruits.contentToString())
// Printing fruits array of object
    println(fruits[0].name)
    for(fruit in fruits) println(fruit.name)
    for (index in fruits.indices) println("${fruits[index].name} is at position $index")

    // multi-valued array
    val mix = arrayOf("dj" , 90 , 's' , "Eminem")
    println(mix.contentToString())
}

data class Fruits(val name : String , val price : Int)
