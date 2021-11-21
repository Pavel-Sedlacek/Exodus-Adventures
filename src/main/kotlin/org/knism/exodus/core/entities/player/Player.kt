package org.knism.exodus.core.entities.player

import org.knism.exodus.core.entities.Entity
import org.knism.exodus.core.entities.stats.PlayerStats
import org.knism.exodus.core.items.weapons.Weapon

class Player(val name: String, override val entityStats: PlayerStats, val inventory: Inventory, override var weapon: Weapon) : Entity {
    override fun die() {
        TODO("Not yet implemented")
    }


    companion object {
        fun loadFromSave(): Player {
            TODO()
        }
    }
}