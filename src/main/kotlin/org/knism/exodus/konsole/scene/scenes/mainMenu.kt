package org.knism.exodus.konsole.scene.scenes

import com.varabyte.konsole.foundation.text.textLine
import org.knism.exodus.konsole.readOption
import org.knism.exodus.konsole.scene.KonsoleScene
import org.knism.exodus.konsole.scene.Scenes

val mainMenu = KonsoleScene { konsole ->
    konsole { textLine("menu") }.run()
    when (readOption("input scene", listOf("loading", "menu", "error", "load"))) {
        "loading" -> konsole.resolveScene(Scenes.GAME_LOADING)
        "menu" -> konsole.resolveScene(Scenes.MAIN_MENU)
        "load" -> konsole.resolveScene(Scenes.LOAD_SAVE)
        else -> konsole.resolveScene(Scenes.INTENSIVE_ERROR)
    }
}