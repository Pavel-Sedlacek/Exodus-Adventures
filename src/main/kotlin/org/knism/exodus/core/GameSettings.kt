package org.knism.exodus.core

import org.knism.exodus.core.annotations.Warning

open class GameSettings {

    @Warning("nemeni to, nebo prepis celej Map.move()")
    val regionEdgeSize = 3

    companion object: GameSettings()
}