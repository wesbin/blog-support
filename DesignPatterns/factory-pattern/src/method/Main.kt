package method

fun main() {

    val axe: Weapon = WeaponFactory().build("Axe")
    println(axe.use())
}