package abstract

import abstract.cpu.CPU
import abstract.cpu.HighPerformanceCPU
import abstract.gpu.GPU
import abstract.gpu.HighPerformanceGPU
import abstract.storage.SSD
import abstract.storage.Storage

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