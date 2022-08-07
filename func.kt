fun printBorder(border : String, timetorepeat : Int){
    repeat(timetorepeat){
        print(border)
    }
}
fun main(){
    print("using repeat function \n")
    val border = "%"
    val timetorepeat = 12;
    printBorder(border , timetorepeat);
}