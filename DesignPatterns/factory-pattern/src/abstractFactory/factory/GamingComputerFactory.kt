package abstractFactory.factory

import abstractFactory.computerPart.cpu.CPU
import abstractFactory.computerPart.cpu.HighPerformanceCPU
import abstractFactory.computerPart.gpu.GPU
import abstractFactory.computerPart.gpu.HighPerformanceGPU
import abstractFactory.computerPart.storage.SSD
import abstractFactory.computerPart.storage.Storage

class GamingComputerFactory: ComputerFactory {

    override fun CPU(): CPU {
        return HighPerformanceCPU()
    }

    override fun GPU(): GPU {
        return HighPerformanceGPU()
    }

    override fun Storage(): Storage {
        return SSD()
    }

}