package abstract

import abstract.cpu.CPU
import abstract.gpu.GPU
import abstract.storage.Storage

interface ComputerFactory {

    fun CPU(): CPU
    fun GPU(): GPU
    fun Storage(): Storage
}