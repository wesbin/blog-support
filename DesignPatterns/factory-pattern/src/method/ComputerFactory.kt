package method

interface ComputerFactory {

    fun makeComputer(type: String): Computer?
}