package org.knism.exodus.core.items.currency

import org.knism.exodus.core.items.ItemQuantity
import org.knism.exodus.core.items.ItemStacks

class Pesos : Currency {
    override val universalValue: Int
        get() = 15
    override var quantity: ItemQuantity = ItemQuantity(1, ItemStacks.COIN())
}