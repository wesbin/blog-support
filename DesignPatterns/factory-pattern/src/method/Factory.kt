package method

interface Factory {

    fun build(type: String): Weapon?
}