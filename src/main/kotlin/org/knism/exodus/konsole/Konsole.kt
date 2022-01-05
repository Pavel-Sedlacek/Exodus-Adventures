package org.knism.exodus.konsole

import com.varabyte.konsole.runtime.KonsoleApp
import org.knism.exodus.konsole.scene.KonsoleScene
import org.knism.exodus.konsole.scene.Scenes
import org.knism.exodus.konsole.scene.konsoleScenes

class Konsole(private val konsoleApp: KonsoleApp) {
    var isActive = true

    private var activeScene: KonsoleScene =
        konsoleScenes[Scenes.GAME_LOADING] ?: konsoleScenes[Scenes.INTENSIVE_ERROR]!!

    fun renderBlock() {
        activeScene.exec(konsoleApp, this)
    }

    fun resolveScene(scenes: Scenes) {
        this.clearScreen()
        this.activeScene = konsoleScenes[scenes] ?: konsoleScenes[Scenes.INTENSIVE_ERROR]!!
        renderBlock()
    }

    private fun clearScreen() {
        this.activeScene = konsoleScenes[Scenes.SCREEN_CLEAR] ?: konsoleScenes[Scenes.INTENSIVE_ERROR]!!
        renderBlock()
    }

}