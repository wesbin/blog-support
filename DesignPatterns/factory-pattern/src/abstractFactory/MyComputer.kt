package abstractFactory

import abstractFactory.factory.ComputerFactory

class MyComputer(computerFactory: ComputerFactory): Computer(computerFactory) {

    override fun use(): String {
        return "MyComputer CPU: ${computerFactory.CPU().info()}, GPU: ${computerFactory.GPU().info()}, Storage: ${computerFactory.Storage().info()}"
    }
}