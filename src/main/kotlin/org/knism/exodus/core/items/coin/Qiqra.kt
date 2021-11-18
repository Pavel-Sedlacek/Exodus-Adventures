package org.knism.exodus.core.items.coin

open class Qiqra private constructor() : Coin {
    override val universalValue: Int
        get() = 1

    companion object : Qiqra()
}