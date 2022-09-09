// Everything in kotlin is Object
fun main(){
    val myFirstDice = Dice(6)
    println(myFirstDice.sides)
    // myFirstDice.sides = 20;
    // val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
    var test = Person("Denis" , "Richie")
    var john = Person()
    john.hobby = "flying"
    john.printHobby()
    var yash = Person("yash" , "pandey" , 20)
    yash.printHobby()
    test.printHobby()
}

class Dice(val sides:Int){
    // var sides = 6
    fun roll() : Int{
        // val randomNumber = (1..sides).random()
        return (1..sides).random()
    }
}

class Person (firstName : String  = "Default", lastName: String = "User"){ // Primary Constructor

    // Member Variables - Properties
    var age : Int? = null  // default values
    var hobby : String? = "Video Games"
    var name : String = firstName
    // Secondary Constructor
    constructor(firstName : String , lastName: String , age : Int) : this(firstName,lastName){
        this.age = age
    }
    init {
        println("Object Initialized")
        println(firstName)
    }
    fun printHobby(){
        println("$name hobby is $hobby")
    }
}
