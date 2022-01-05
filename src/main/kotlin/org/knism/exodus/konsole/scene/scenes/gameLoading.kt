package org.knism.exodus.konsole.scene.scenes

import com.varabyte.konsole.foundation.anim.konsoleAnimOf
import com.varabyte.konsole.foundation.text.text
import org.knism.exodus.konsole.scene.KonsoleScene
import org.knism.exodus.konsole.scene.Scenes
import org.knism.exodus.time.millis


val gameLoading = KonsoleScene { konsole ->
    val spinner = konsoleAnimOf(listOf("\\", "|", "/", "-"), millis(125))
    konsole { text(spinner) }.run {
        // TODO load game
    }
    konsole.resolveScene(Scenes.MAIN_MENU)
}