package org.knism.exodus.core.items.currency

import org.knism.exodus.core.items.ItemQuantity
import org.knism.exodus.core.items.ItemStacks

class Qiqra : Currency {
    override val universalValue: Int
        get() = 1

    override var quantity: ItemQuantity = ItemQuantity(1, ItemStacks.COIN())

}