package org.knism.exodus.core.map.tile

import org.knism.exodus.core.entities.enemies.Enemy
import org.knism.exodus.core.entities.enemies.generator.EnemyGenerator
import org.knism.exodus.core.items.resources.Resource
import org.knism.exodus.core.items.resources.ResourceGenerator

class Tile(private val tileType: TileType, private val id: Int) {
    val enemy: Enemy = EnemyGenerator.genEnemy(tileType)
    val resources: List<Resource> = ResourceGenerator.genResources(tileType)
}