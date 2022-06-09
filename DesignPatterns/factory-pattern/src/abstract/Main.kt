package abstract

fun main() {
    val crossbowFactory: WeaponFactory = Crossbow.Factory
    val crossbow = crossbowFactory.buildWeapon()
    println(crossbow.use())

    val swordFactory:WeaponFactory = Sword.Factory
    val sword = swordFactory.buildWeapon()
    println(sword.use())
}