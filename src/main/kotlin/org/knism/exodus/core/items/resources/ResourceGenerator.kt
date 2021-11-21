package org.knism.exodus.core.items.resources

import org.knism.exodus.core.map.tile.TileType
import org.knism.exodus.util.collect

open class ResourceGenerator private constructor() {

    fun genResources(tileType: TileType): List<Resource> {
        return collect(5) { genResource(tileType) }
    }

    private fun genResource(tileType: TileType): Resource {
        return ResourceTables.randomFrom(tileType)
    }

    companion object : ResourceGenerator()
}