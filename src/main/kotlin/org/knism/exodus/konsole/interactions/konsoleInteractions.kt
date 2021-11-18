package org.knism.exodus.konsole.interactions

import com.varabyte.konsole.foundation.input.Completions
import com.varabyte.konsole.foundation.input.input
import com.varabyte.konsole.foundation.text.text
import com.varabyte.konsole.foundation.text.textLine
import org.knism.exodus.konsole.Konsole

fun Konsole.yesOrNo(question: String): YesNo {
    var x = false
    append {
        onInput = { input ->
            println("")
            x = "yes".startsWith(input.lowercase())
        }
        textLine(question)
        text("> "); input(Completions("yes", "no"))
    }
    return if (x) YesNo.YES else YesNo.NO
}