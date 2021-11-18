package org.knism.exodus.core.entities.stats

data class Armor(val min: Int = 0, val max: Int = 100, var current: Int = min)