package org.knism.exodus.konsole.scene

import org.knism.exodus.konsole.scene.scenes.*

val konsoleScenes = mapOf(
    Scenes.SCREEN_CLEAR to screenClear,
    Scenes.GAME_LOADING to gameLoading,
    Scenes.MAIN_MENU to mainMenu,
    Scenes.INTENSIVE_ERROR to somethingWentWrong,
    Scenes.GAME to gameplay,
    Scenes.LOAD_SAVE to loadSave
)