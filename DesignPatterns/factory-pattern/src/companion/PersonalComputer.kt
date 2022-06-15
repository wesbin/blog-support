package companion

class PersonalComputer: Computer {

    companion object Factory: ComputerFactory() {
        override fun buildComputer(): Computer = PersonalComputer()
    }

    override fun check(): String {
        return "is PersonalComputer"
    }
}