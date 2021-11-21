package org.knism.exodus.core.items.weapons.weaponTables

import org.knism.exodus.core.items.ItemQuantity
import org.knism.exodus.core.items.ItemStacks
import org.knism.exodus.core.items.weapons.EnemyWeapon

open class EnemyWeapons private constructor() {

    val zombie_hand =
        EnemyWeapon(20, 50, ItemQuantity(1, ItemStacks.WEAPON()))

    companion object : EnemyWeapons()
}