package org.knism.exodus.konsole.scene.scenes

import com.varabyte.konsole.foundation.text.textLine
import org.knism.exodus.konsole.scene.KonsoleScene

val somethingWentWrong = KonsoleScene { konsole ->
    konsole { textLine("something went wrong") }.run()
    konsole.isActive = false
}