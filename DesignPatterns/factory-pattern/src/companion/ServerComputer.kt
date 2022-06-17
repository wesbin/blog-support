package companion

class ServerComputer: Computer {

    companion object Factory: ComputerFactory() {
        override fun createComputer(): Computer = ServerComputer()
    }

    override fun check(): String {
        return "is ServerComputer"
    }
}