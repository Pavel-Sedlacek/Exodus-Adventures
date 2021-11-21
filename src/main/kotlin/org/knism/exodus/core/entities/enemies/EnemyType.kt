package org.knism.exodus.core.entities.enemies

import org.knism.exodus.core.map.tile.TileType

enum class EnemyType(val monster_name: String, vararg val regions: TileType) {
    ZOMBIE("zombie", TileType.Rock),
    SKELETON("skeleton", TileType.Street),
    UNDEAD("undead", TileType.Shallow),
    ORC("orc", TileType.Desert),
    GOLEM("golem", TileType.Forest),
    GOBLIN("goblin", TileType.Jungle);
}