package abstract

class Computer(private val computerFactory: ComputerFactory) {

    fun use(): String {
        return "CPU: ${computerFactory.CPU()}, GPU: ${computerFactory.GPU()}, Storage: ${computerFactory.Storage()}"
    }
}