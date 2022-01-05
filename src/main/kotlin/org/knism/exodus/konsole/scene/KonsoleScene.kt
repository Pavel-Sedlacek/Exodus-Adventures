package org.knism.exodus.konsole.scene

import com.varabyte.konsole.runtime.KonsoleApp
import org.knism.exodus.konsole.Konsole

class KonsoleScene(val block: KonsoleApp.(konsole: Konsole) -> Unit = {}) {
    fun exec(x: KonsoleApp, konsole: Konsole) {
        this.block(x, konsole)
    }
}
