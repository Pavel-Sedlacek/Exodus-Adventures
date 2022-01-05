package org.knism.exodus.konsole.scene.scenes

import com.varabyte.konsole.foundation.text.textLine
import org.knism.exodus.konsole.scene.KonsoleScene

val screenClear = KonsoleScene {
    // very much illegal
    konsole { repeat(80) { textLine() } }.run()
}