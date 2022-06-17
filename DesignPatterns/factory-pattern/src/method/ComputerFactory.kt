package method

interface ComputerFactory {

    fun createComputer(type: String): Computer?
}