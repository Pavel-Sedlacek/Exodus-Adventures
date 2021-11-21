package org.knism.exodus.core.items.weapons

import org.knism.exodus.core.items.ItemQuantity

class Sword(
    override val damage: Int,
    override val accuracy: Int,
    override var quantity: ItemQuantity,
    override val weaponClass: WeaponClass = WeaponClass.SWORD,
) : Weapon {
    override fun invoke(): Weapon = Sword(this.damage, this.accuracy, this.quantity, this.weaponClass)
}

