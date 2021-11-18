package org.knism.exodus.core.map.region

enum class RegionTypes {
    Ocean,
    Forest,
    City,
    Desert;

    companion object {
        fun random(): RegionTypes {
            return RegionTypes.values().random()
        }
    }
}