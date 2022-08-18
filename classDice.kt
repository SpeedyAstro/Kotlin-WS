fun main(){
    val myFirstDice = Dice(6)
    println(myFirstDice.sides)
    // myFirstDice.sides = 20;
    // val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
}

class Dice(val sides:Int){
    // var sides = 6
    fun roll() : Int{
        // val randomNumber = (1..sides).random()
        return (1..sides).random()
    }
}