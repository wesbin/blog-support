package abstractFactory.factory

import abstractFactory.computerPart.cpu.CPU
import abstractFactory.computerPart.gpu.GPU
import abstractFactory.computerPart.storage.Storage

interface ComputerFactory {

    fun CPU(): CPU
    fun GPU(): GPU
    fun Storage(): Storage
}