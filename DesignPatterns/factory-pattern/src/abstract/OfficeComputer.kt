package abstract

import abstract.cpu.CPU
import abstract.cpu.CostPerformanceCPU
import abstract.gpu.CostPerformanceGPU
import abstract.gpu.GPU
import abstract.storage.HDD
import abstract.storage.Storage

class OfficeComputer: Computer {

    companion object Factory: ComputerFactory() {
        override fun CPU(): CPU = CostPerformanceCPU()
        override fun GPU(): GPU = CostPerformanceGPU()
        override fun Storage(): Storage = HDD()
    }

    override fun checkSpec(): String {
        return "CPU: ${CPU().info()}"
    }
}