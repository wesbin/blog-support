package companion

fun main() {
    val personalComputerFactory: ComputerFactory = PersonalComputer.Factory
    val personalComputer: Computer = personalComputerFactory.createComputer()
    println(personalComputer.check())

    val serverComputerFactory: ComputerFactory = ServerComputer.Factory
    val serverComputer: Computer = serverComputerFactory.createComputer()
    println(serverComputer.check())
}