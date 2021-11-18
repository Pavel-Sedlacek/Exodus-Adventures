package org.knism.exodus.core.map.region

import org.knism.exodus.core.GameSettings
import org.knism.exodus.core.map.tile.Tile
import org.knism.exodus.core.map.tile.TileType

class Region private constructor(private val region: RegionTypes, private val id: Int) {

    val levels = mutableListOf<Tile>()

    fun instantiate() {
        repeat(GameSettings.regionEdgeSize * GameSettings.regionEdgeSize) {
            levels.add(Tile(TileType.random(region), it))
        }
    }

    companion object {
        fun newRegion(id: Int): Region {
            val reg = Region(RegionTypes.random(), id)
            reg.instantiate()
            return reg
        }
    }
}