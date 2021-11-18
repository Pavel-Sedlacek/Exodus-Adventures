package org.knism.exodus.core.entities

import org.knism.exodus.core.entities.stats.EntityStats

interface Entity {
    val entityStats: EntityStats
}
