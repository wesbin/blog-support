package abstract

abstract class WeaponFactory {

    abstract fun buildWeapon(): Weapon
    abstract fun material(): Material
}