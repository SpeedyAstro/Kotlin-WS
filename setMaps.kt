fun main(){
    val fruits  = setOf("Orange" , "Apple" , "Apple" , "Potato")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Grape")
    newFruits.add("Pear")
    println(newFruits.elementAt(4))
    // Maps
    val dayOfWeek = mapOf(1 to "Monday", 2 to "Tuesday" , 3 to "Wednesday")
    for (key in dayOfWeek.keys)
    println("$key is to value ${dayOfWeek[key]}")

    val fruitMap = mapOf("Favorite" to Fruit("Grape" , 29.2) , "OK" to Fruit("Banana" , 21.2))

    fruitMap.toSortedMap()
    println(fruitMap)

}
data class Fruit(val name :String , val price : Double)