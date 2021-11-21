package org.knism.exodus.core.items

interface Item {
    val type: ItemType
    var quantity: ItemQuantity
}