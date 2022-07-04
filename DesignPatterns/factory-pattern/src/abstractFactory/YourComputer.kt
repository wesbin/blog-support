package abstractFactory

import abstractFactory.factory.ComputerFactory

class YourComputer(computerFactory: ComputerFactory): Computer(computerFactory) {

    override fun use(): String {
        return "YourComputer CPU: ${computerFactory.CPU().info()}, GPU: ${computerFactory.GPU().info()}, Storage: ${computerFactory.Storage().info()}"
    }
}