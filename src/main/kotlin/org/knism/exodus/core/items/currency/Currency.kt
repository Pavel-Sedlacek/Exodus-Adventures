package org.knism.exodus.core.items.currency

import org.knism.exodus.core.items.Item
import org.knism.exodus.core.items.ItemQuantity
import org.knism.exodus.core.items.ItemStacks
import org.knism.exodus.core.items.ItemType

interface Currency: Item {
    override val type: ItemType
        get() = ItemType.COIN
    val universalValue: Int
}