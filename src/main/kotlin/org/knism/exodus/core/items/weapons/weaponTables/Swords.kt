package org.knism.exodus.core.items.weapons.weaponTables

import org.knism.exodus.core.items.ItemQuantity
import org.knism.exodus.core.items.ItemStacks
import org.knism.exodus.core.items.weapons.Sword

open class Swords private constructor() {

    val swordOfManyTruths =
        Sword(20, 0, ItemQuantity(1, ItemStacks.WEAPON()))

    val w =
        Sword(20, 0, ItemQuantity(1, ItemStacks.WEAPON()))

    val x =
        Sword(20, 0, ItemQuantity(1, ItemStacks.WEAPON()))

    val y =
        Sword(20, 0, ItemQuantity(1, ItemStacks.WEAPON()))

    val z =
        Sword(20, 0, ItemQuantity(1, ItemStacks.WEAPON()))

    companion object : Swords()
}