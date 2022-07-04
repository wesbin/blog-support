package abstractFactory.factory

import abstractFactory.computerPart.cpu.CPU
import abstractFactory.computerPart.cpu.CostPerformanceCPU
import abstractFactory.computerPart.gpu.CostPerformanceGPU
import abstractFactory.computerPart.gpu.GPU
import abstractFactory.computerPart.storage.HDD
import abstractFactory.computerPart.storage.Storage

class OfficeComputerFactory: ComputerFactory {
    override fun CPU(): CPU {
        return CostPerformanceCPU()
    }

    override fun GPU(): GPU {
        return CostPerformanceGPU()
    }

    override fun Storage(): Storage {
        return HDD()
    }
}