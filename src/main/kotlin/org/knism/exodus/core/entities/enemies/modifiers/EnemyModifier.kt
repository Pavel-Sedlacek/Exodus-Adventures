package org.knism.exodus.core.entities.enemies.modifiers

import org.knism.exodus.core.entities.Entity
import org.knism.exodus.core.entities.enemies.Enemy

data class EnemyModifier(val modify: (enemy: Entity) -> Unit) {
    fun apply(enemy: Enemy) = modify.invoke(enemy)
}