package companion

fun main() {
    val personalComputerFactory: ComputerFactory = PersonalComputer.Factory
    val personalComputer: Computer = personalComputerFactory.buildComputer()
    println(personalComputer.check())

    val serverComputerFactory: ComputerFactory = ServerComputer.Factory
    val serverComputer: Computer = serverComputerFactory.buildComputer()
    println(serverComputer.check())
}