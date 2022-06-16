package abstract

import abstract.cpu.CPU
import abstract.cpu.CostPerformanceCPU
import abstract.gpu.CostPerformanceGPU
import abstract.gpu.GPU
import abstract.storage.HDD
import abstract.storage.Storage

class OfficeComputer: Computer {

    override fun use(): String {
        return "use OfficeComputer"
    }
}