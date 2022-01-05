package org.knism.exodus.saves

import java.io.File

class SaveManager {
    fun availableSaves(): List<Save> {
        val meta = File("src/main/res/s01/meta.per")
        return listOf(
            Save(
                0,
                PlayerFile(File("src/main/res/s01/player.per")),
                WorldMapFile(File("src/main/res/s01/world.per")),
                123213,
                "213"
            )
        )
    }
}

data class Save(val id: Int, val player: PlayerFile, val worldMap: WorldMapFile, val playtime: Int, val name: String)

data class PlayerFile(val file: File) {
    val name: String = ""
}

data class WorldMapFile(val file: File)