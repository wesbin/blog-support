package abstract.cpu

abstract class CPU {

    fun info(): String {
        return this::class.simpleName.toString()
    }
}