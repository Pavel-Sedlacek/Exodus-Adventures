package org.knism.exodus.game

import org.knism.exodus.core.entities.player.Player
import org.knism.exodus.core.map.WorldMap

object GameData {
    var player: Player = Player.default()
    var world: WorldMap = WorldMap.default()
}