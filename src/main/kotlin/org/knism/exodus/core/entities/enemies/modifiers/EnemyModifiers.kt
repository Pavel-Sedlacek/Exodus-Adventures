package org.knism.exodus.core.entities.enemies.modifiers

import org.knism.exodus.core.entities.enemies.EnemyType

open class EnemyModifiers private constructor() {

    val healthy = EnemyModifier { enemy ->
        with(enemy.entityStats.health) {
            max = (max * 1.2).toInt()
            current = max
        }
    }


    fun random(enemy: EnemyType): EnemyModifier {
        TODO()
    }

    companion object : EnemyModifiers()
}