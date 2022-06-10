package method

class WeaponFactory: Factory {

    override fun build(type: String): Weapon {
        return when (type) {
            "Axe" -> Axe()
            "Spear" -> Spear()
            else -> WeirdWeapon()
        }
    }
}