package org.knism.exodus.core.entities.stats

data class Level(val currentLevel: Int, val currentXp: Int, val maxLevel: Int, val levelRequirementsScaling: LevelRequirementsScaling)