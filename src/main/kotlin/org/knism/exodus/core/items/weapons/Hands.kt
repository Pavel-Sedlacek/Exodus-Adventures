package org.knism.exodus.core.items.weapons

import org.knism.exodus.core.items.ItemQuantity
import org.knism.exodus.core.items.ItemStacks

class Hands: Weapon {
    override val damage: Int
        get() = 5
    override val weaponClass: WeaponClass
        get() = WeaponClass.HANDS
    override val accuracy: Int
        get() = 100

    override fun invoke(): Weapon = Hands()

    override var quantity: ItemQuantity = ItemQuantity(1, ItemStacks.WEAPON())
}