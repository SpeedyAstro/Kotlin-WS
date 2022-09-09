fun main(){
    val user1 = User(1,"Denis")
    println(user1.name)
    println(user1)
    val user2 = User(2, "Harris")
    val updateUser = user1.copy(name = "Snoop")
    println(updateUser)
    println(user2)
    print(updateUser.component1()) // prints 1 id
    print(updateUser.component2()) // prints name
    val (id , name ) = updateUser
}
data class User(val id : Long , val name : String)
