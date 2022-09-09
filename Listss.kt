fun main(){
    // List is also can contains any type of data
    val months = listOf("January" , "February" , "March")
    val anyTypes = listOf(1,2,3,true , "yea")
    print(anyTypes.size)
    println(anyTypes[0])
    for (month in months) println(month)
// list is by default immutable , to make mutable list we can convert default list to mutable list
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April" , "May" , "June" , "April" , "May" , "June")
    additionalMonths.addAll(newMonths)
    println(additionalMonths)

    // implementing mutable list
    val days = mutableListOf<String>("Monday", "Tuesday" , "Wednesday" , "Friday" , "Sunday")
    days.add("Thursday")
    days.removeAt(1)
    val removeList = mutableListOf<String>("Monday" , "Sunday")
    days.removeAll(removeList)
    println(days)
}