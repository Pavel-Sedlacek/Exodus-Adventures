package org.knism.exodus.konsole.scene.scenes

import com.varabyte.konsole.foundation.text.textLine
import org.knism.exodus.core.entities.player.Player
import org.knism.exodus.core.map.WorldMap
import org.knism.exodus.game.GameData
import org.knism.exodus.konsole.Settings
import org.knism.exodus.konsole.readOption
import org.knism.exodus.konsole.scene.KonsoleScene
import org.knism.exodus.saves.SaveManager

val loadSave = KonsoleScene {
    val availableSaves = SaveManager().availableSaves()
    konsole {
        textLine("available saves:")
        for (i in availableSaves) {
            textLine(
                "${i.id}" +
                        " ".repeat(2 - i.id.toString().length) +
                        "${i.name}${" ".repeat(Settings.maxSaveLength - i.name.length)}" +
                        i.player.name +
                        " ".repeat(Settings.maxNameLength - i.player.name.length) +
                        "${i.playtime}"
            )
        }
    }.run()
    val save =
        availableSaves.find { it.id == readOption("Select save", availableSaves.map { it.id.toString() }).toInt() }!!
    GameData.player = Player.loadFromSave(save.player)
    GameData.world = WorldMap.loadFromSave(save.worldMap)
}