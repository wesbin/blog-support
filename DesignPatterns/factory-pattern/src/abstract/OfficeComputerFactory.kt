package abstract

import abstract.cpu.CPU
import abstract.cpu.CostPerformanceCPU
import abstract.gpu.CostPerformanceGPU
import abstract.gpu.GPU
import abstract.storage.HDD
import abstract.storage.Storage

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