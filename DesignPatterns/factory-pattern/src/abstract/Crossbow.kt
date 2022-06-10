package abstract

class Crossbow: Weapon {

    companion object Factory: WeaponFactory() {
        override fun buildWeapon() = Crossbow()
        override fun material(): Material = Wood()
    }

    override fun use(): String {
        return "Using crossbow weapon"
    }
}