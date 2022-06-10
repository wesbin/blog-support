package abstract

class Sword: Weapon {

    companion object Factory: WeaponFactory() {
        override fun buildWeapon() = Sword()
        override fun material(): Material = Iron()
    }

    override fun use(): String {
        return "Using sword weapon"
    }
}