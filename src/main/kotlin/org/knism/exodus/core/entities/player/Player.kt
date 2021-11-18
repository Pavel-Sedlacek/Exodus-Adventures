package org.knism.exodus.core.entities.player

import org.knism.exodus.core.entities.Entity
import org.knism.exodus.core.entities.stats.PlayerStats

class Player(override val entityStats: PlayerStats, val inventory: Inventory) : Entity {

}