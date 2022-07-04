package abstract

fun main() {

    val myComputer = Computer(OfficeComputerFactory())
    println(myComputer.use())
}