package org.knism.exodus.core.items.weapons

import org.knism.exodus.core.entities.Entity
import org.knism.exodus.core.items.Item
import org.knism.exodus.core.items.ItemType

interface Weapon : Item {

    override val type: ItemType
        get() = ItemType.WEAPON

    val damage: Int

    val weaponClass: WeaponClass

    val accuracy: Int

    fun dealDamage(target: Entity) = target.takeDamage(this.damage)

    operator fun invoke(): Weapon
}