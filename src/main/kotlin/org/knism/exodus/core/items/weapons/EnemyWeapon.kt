package org.knism.exodus.core.items.weapons

import org.knism.exodus.core.items.ItemQuantity

class EnemyWeapon(
    override val damage: Int,
    override val accuracy: Int,
    override var quantity: ItemQuantity,
    override val weaponClass: WeaponClass = WeaponClass.ENEMY,
) : Weapon {
    override fun invoke(): Weapon = EnemyWeapon(this.damage, this.accuracy, this.quantity, this.weaponClass)
}

