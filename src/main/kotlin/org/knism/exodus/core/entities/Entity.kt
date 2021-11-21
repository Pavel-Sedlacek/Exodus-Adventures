package org.knism.exodus.core.entities

import org.knism.exodus.core.entities.stats.EntityStats
import org.knism.exodus.core.items.weapons.Weapon

interface Entity {
    fun takeDamage(damage: Int) {
        this.entityStats.health.current -= damage
        if (isDead()) die()
    }

    fun die()
    private fun isDead(): Boolean = this.entityStats.health.current < this.entityStats.health.min

    val entityStats: EntityStats
    var weapon: Weapon
}
