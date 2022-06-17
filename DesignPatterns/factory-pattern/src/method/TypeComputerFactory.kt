package method

class TypeComputerFactory: ComputerFactory {

    override fun createComputer(type: String): Computer? {
        return when (type) {
            "laptop" -> LaptopComputer()
            "desktop" -> DesktopComputer()
            else -> null
        }
    }
}