package abstract

import abstract.cpu.CPU
import abstract.gpu.GPU
import abstract.storage.Storage

abstract class ComputerFactory {

    abstract fun CPU(): CPU
    abstract fun GPU(): GPU
    abstract fun Storage(): Storage
}