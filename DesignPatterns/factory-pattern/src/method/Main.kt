package method

fun main() {

    val typeComputerFactory: TypeComputerFactory = TypeComputerFactory()
    val computer: Computer? = typeComputerFactory.createComputer("laptop")
    println(computer?.use())
}