package org.knism.exodus.core.items.armor

import org.knism.exodus.core.items.Item
import org.knism.exodus.core.items.ItemType

interface Armor: Item {
    override val type: ItemType
        get() = ItemType.ARMOR
    val armor: Int
    val armorSlot: ArmorSlot
}