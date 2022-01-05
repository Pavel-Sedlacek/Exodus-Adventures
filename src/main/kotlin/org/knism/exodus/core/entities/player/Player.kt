package org.knism.exodus.core.entities.player

import org.knism.exodus.core.entities.Entity
import org.knism.exodus.core.entities.stats.*
import org.knism.exodus.core.items.weapons.Hands
import org.knism.exodus.core.items.weapons.Weapon
import org.knism.exodus.saves.PlayerFile

class Player(
    var name: String,
    override val entityStats: PlayerStats,
    val inventory: Inventory,
    override var weapon: Weapon
) : Entity {
    override fun die() {
        TODO("Not yet implemented")
    }


    companion object {
        fun loadFromSave(save: PlayerFile): Player {
            TODO()
        }

        fun default(): Player = Player(
            "unnamed",
            PlayerStats(Level(0, 0, 30, LevelRequirementsScaling(1)), Health(), Armor(), Mana()),
            Inventory(),
            Hands()
        )
    }
}