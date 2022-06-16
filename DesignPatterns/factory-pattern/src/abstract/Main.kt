package abstract

fun main() {
    val officeComputerFactory: ComputerFactory = OfficeComputer.Factory
    println(officeComputerFactory.CPU().info())
}