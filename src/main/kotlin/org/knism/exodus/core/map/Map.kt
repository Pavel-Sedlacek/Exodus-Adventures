package org.knism.exodus.core.map

import org.knism.exodus.core.GameSettings

class Map private constructor() {

    val map = mutableMapOf<Coordinate, Region>()
    private var id = 0


    fun revealAround(player: Position) {
        val visionRange = GameSettings.vision
        for (x in -visionRange..visionRange) {
            for (y in -visionRange..visionRange) {
                if (!map.contains(Coordinate(player.regionX + x, player.regionY + y))) {
                    createRegion(player.regionX + x, player.regionY + y)
                }
            }
        }
    }

    private fun createRegion(x: Int, y: Int) {
        val region = Region.newRegion(id++)
        region.instantiate()
        map[Coordinate(x, y)] = region
    }

    companion object {
        fun newMap(): Map {
            return Map()
        }
    }
}