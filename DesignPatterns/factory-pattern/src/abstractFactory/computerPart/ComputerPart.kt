package abstractFactory.computerPart

open class ComputerPart {

    fun info(): String {
        return this::class.simpleName.toString()
    }
}