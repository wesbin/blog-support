package abstractFactory

import abstractFactory.factory.GamingComputerFactory

fun main() {

    val gamingComputerFactory = GamingComputerFactory()
    val myComputer = MyComputer(gamingComputerFactory)
    println(myComputer.use())
    val yourComputer = YourComputer(gamingComputerFactory)
    println(yourComputer.use())
}