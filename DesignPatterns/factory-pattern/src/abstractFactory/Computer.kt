package abstractFactory

import abstractFactory.factory.ComputerFactory

abstract class Computer(val computerFactory: ComputerFactory) {

    abstract fun use(): String
}