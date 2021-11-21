package org.knism.exodus.core.items

enum class ItemStacks(val stack: Int) {
    WEAPON(1),
    ARMOR(1),
    AMMUNITION(1024),
    COIN(1_048_576);

    operator fun invoke() = stack
}