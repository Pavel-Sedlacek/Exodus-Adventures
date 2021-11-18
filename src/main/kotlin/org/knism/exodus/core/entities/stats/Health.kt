package org.knism.exodus.core.entities.stats

data class Health(val min: Int = 0, val max: Int = 100, var current: Int = max)