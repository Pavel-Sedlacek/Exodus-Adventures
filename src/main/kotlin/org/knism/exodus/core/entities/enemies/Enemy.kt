package org.knism.exodus.core.entities.enemies

import org.knism.exodus.core.entities.Entity
import org.knism.exodus.core.entities.enemies.modifiers.EnemyModifier
import org.knism.exodus.core.items.weapons.Weapon
import org.knism.exodus.core.map.region.RegionTypes
import org.knism.exodus.core.map.tile.TileType

interface Enemy: Entity {
    val region: TileType
    val name: String
    val type: EnemyType
    val modifiers: List<EnemyModifier>
}