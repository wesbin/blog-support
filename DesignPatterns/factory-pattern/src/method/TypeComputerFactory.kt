package method

class TypeComputerFactory: ComputerFactory {

    override fun makeComputer(type: String): Computer? {
        return when (type) {
            "laptop" -> LaptopComputer()
            "desktop" -> DesktopComputer()
            else -> null
        }
    }
}