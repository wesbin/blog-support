package companion

class PersonalComputer: Computer {

    companion object Factory: ComputerFactory() {
        override fun createComputer(): Computer = PersonalComputer()
    }

    override fun check(): String {
        return "is PersonalComputer"
    }
}