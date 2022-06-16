package method

fun main() {

    val typeComputerFactory: TypeComputerFactory = TypeComputerFactory()
    val computer: Computer? = typeComputerFactory.makeComputer("laptop")
    println(computer?.use())
}