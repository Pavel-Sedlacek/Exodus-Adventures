package org.knism.exodus.core.map.tile

import org.knism.exodus.core.map.region.RegionTypes

enum class TileType(private val region: RegionTypes) {
    Square(RegionTypes.City),
    Tower(RegionTypes.City),
    Street(RegionTypes.City),

    Oasis(RegionTypes.Desert),
    Town(RegionTypes.Desert),
    Desert(RegionTypes.Desert),
    Dunes(RegionTypes.Desert),

    Glade(RegionTypes.Forest),
    Forest(RegionTypes.Forest),
    Jungle(RegionTypes.Forest),
    Rock(RegionTypes.Forest),

    Deep(RegionTypes.Ocean),
    Shallow(RegionTypes.Ocean),
    CoralReef(RegionTypes.Ocean);

    companion object {
        fun random(region: RegionTypes): TileType {
            return TileType.values().filter { it.region == region }.random()
        }
    }
}