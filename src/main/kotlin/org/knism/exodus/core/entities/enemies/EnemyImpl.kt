package org.knism.exodus.core.entities.enemies

import org.knism.exodus.core.entities.enemies.modifiers.EnemyModifier
import org.knism.exodus.core.entities.stats.EntityStats
import org.knism.exodus.core.items.weapons.Hands
import org.knism.exodus.core.items.weapons.Weapon
import org.knism.exodus.core.map.region.RegionTypes
import org.knism.exodus.core.map.tile.TileType

class EnemyImpl(
    override val entityStats: EntityStats,
    override var weapon: Weapon,
    override val region: TileType,
    override val name: String,
    override val type: EnemyType,
    override val modifiers: List<EnemyModifier>,
) : Enemy {
    override fun die() {
        TODO("Not yet implemented")
    }
}