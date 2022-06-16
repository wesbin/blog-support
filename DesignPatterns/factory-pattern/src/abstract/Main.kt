package abstract

fun main() {

    val myComputer = MyComputer(OfficeComputerFactory())
    println(myComputer.use())
}