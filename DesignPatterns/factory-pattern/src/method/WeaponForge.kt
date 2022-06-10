package method

class WeaponForge: Forge {

    override fun casting(type: String): Weapon {
        return when (type) {
            "Axe" -> Axe()
            "Spear" -> Spear()
            else -> WeirdWeapon()
        }
    }
}