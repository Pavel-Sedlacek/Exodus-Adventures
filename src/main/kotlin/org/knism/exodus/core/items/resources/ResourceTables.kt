package org.knism.exodus.core.items.resources

import org.knism.exodus.core.map.tile.TileType

open class ResourceTables private constructor() {
    fun randomFrom(tileType: TileType): Resource {
        return resourceTable[tileType]?.random() ?: TODO()
    }

    private val resourceTable = mapOf<TileType, List<Resource>>(
        TileType.Square to listOf(),
        TileType.Tower to listOf(),
        TileType.Street to listOf(),
        TileType.Oasis to listOf(),
        TileType.Town to listOf(),
        TileType.Desert to listOf(),
        TileType.Dunes to listOf(),
        TileType.Glade to listOf(),
        TileType.Forest to listOf(),
        TileType.Jungle to listOf(),
        TileType.Rock to listOf(),
        TileType.Deep to listOf(),
        TileType.Shallow to listOf(),
        TileType.CoralReef to listOf()
    )

    companion object : ResourceTables()
}