package org.knism.exodus.core.map

class Region private constructor(private val region: RegionTypes, private val id: Int) {

    val levels = mutableListOf<Tile>()

    fun instantiate() {
        repeat(5) {
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