package org.knism.exodus.core.entities.enemies.generator

import org.knism.exodus.core.entities.enemies.Enemy
import org.knism.exodus.core.entities.enemies.EnemyImpl
import org.knism.exodus.core.entities.enemies.EnemyType
import org.knism.exodus.core.entities.enemies.modifiers.EnemyModifier
import org.knism.exodus.core.entities.stats.*
import org.knism.exodus.core.items.weapons.weaponTables.EnemyWeapons
import org.knism.exodus.core.map.tile.TileType

open class EnemyGenerator private constructor() {

    private fun zombie(tileType: TileType, name: String, modifiers: List<EnemyModifier>, currentLevel: Int) =
        EnemyImpl(EntityStats(Level(currentLevel, 0, currentLevel, LevelRequirementsScaling(0)),
            Health(0, 100),
            Armor(0, 100)),
            EnemyWeapons.zombie_hand(),
            tileType,
            name,
            EnemyType.ZOMBIE,
            modifiers)


    fun genEnemy(tileType: TileType): Enemy {
        // TODO
        return zombie(tileType, "dummy", listOf(), 1)
    }

    companion object : EnemyGenerator()
}