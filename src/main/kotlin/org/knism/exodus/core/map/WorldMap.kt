package org.knism.exodus.core.map

import org.knism.exodus.core.PlayerGlobal
import org.knism.exodus.core.generators.sequence.IntGenerator
import org.knism.exodus.core.map.region.Region
import org.knism.exodus.saves.WorldMapFile

class WorldMap private constructor() {
    val map = mutableMapOf<Coordinate, Region>()
    private var idGenerator = IntGenerator(false)

    private val virtualPlayer = Position(0, 0, -1)

    fun moveUp() = this.move(0, Directions.UP.value)
    fun moveDown() = this.move(0, Directions.Down.value)
    fun moveLeft() = this.move(Directions.Left.value, 0)
    fun moveRight() = this.move(Directions.Right.value, 0)

    private fun move(x: Int, y: Int) {
        var fX = virtualPlayer.regionX
        var fY = virtualPlayer.regionY

        var id = virtualPlayer.tileId

        when (x) {
            Directions.Left.value -> when (id) {
                0, 3, 6 -> {
                    fX += Directions.Left.value
                    id += 3 - x
                }
                else -> id -= x
            }
            Directions.Right.value -> when (id) {
                2, 5, 8 -> {
                    fX += Directions.Right.value
                    id -= 3 - x
                }
                else -> id += x
            }
        }
        when (y) {
            Directions.UP.value -> when (id) {
                0, 1, 2 -> {
                    fY += Directions.UP.value
                    id += 3 * (3 - x)
                }
                else -> id -= 3 * x
            }
            Directions.Down.value -> when (id) {
                6, 7, 8 -> {
                    fX += Directions.Down.value
                    id -= 3 * (3 - x)
                }
                else -> id += 3 * x
            }
        }

        with(virtualPlayer) {
            regionX = fX
            regionY = fY
            tileId = id
        }
        revealAround(virtualPlayer)
    }

    private fun revealAround(player: Position) {
        val visionRange = PlayerGlobal.visionRange
        for (x in -visionRange..visionRange) {
            for (y in -visionRange..visionRange) {
                if (!map.contains(Coordinate(player.regionX + x, player.regionY + y))) {
                    createRegion(player.regionX + x, player.regionY + y)
                }
            }
        }
    }

    private fun createRegion(x: Int, y: Int) {
        val region = Region.newRegion(idGenerator.next())
        region.instantiate()
        map[Coordinate(x, y)] = region
    }

    companion object {
        fun default(): WorldMap {
            val x = WorldMap()
            x.revealAround(Position(0, 0, -1))
            with(x.virtualPlayer) {
                regionX = 0
                regionY = 0
                tileId = 5
            }
            return x
        }

        fun loadFromSave(worldMap: WorldMapFile): WorldMap {
            TODO()
        }
    }
}
