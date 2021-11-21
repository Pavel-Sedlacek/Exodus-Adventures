package org.knism.exodus.konsole.interactions

import com.varabyte.konsole.foundation.input.Completions
import com.varabyte.konsole.foundation.input.input
import com.varabyte.konsole.foundation.input.onInputEntered
import com.varabyte.konsole.foundation.input.runUntilInputEntered
import com.varabyte.konsole.foundation.text.text
import com.varabyte.konsole.foundation.text.textLine
import com.varabyte.konsole.runtime.render.RenderScope
import org.knism.exodus.konsole.Konsole

private fun RenderScope.kInput(vararg completions: String) {
    text("> ")
    input(Completions(*completions))
}

fun Konsole.yesOrNo(question: String): YesNo {
    var response: YesNo? = null
    Konsole.append {
        konsole {
            textLine(question)
            kInput("yes", "no")
        }.runUntilInputEntered {
            onInputEntered { response = if ("yes".startsWith(input)) YesNo.YES else YesNo.NO }
        }
    }
    while (response == null) {
        Thread.sleep(50)
    }
    return response!!
}

fun Konsole.select(question: String, options: List<String>): String {
    var response: String? = null
    Konsole.append {
        konsole {
            textLine(question)
            textLine(options.joinToString(",", "[", "]"))
            kInput("yes", "no")
        }.runUntilInputEntered {
            onInputEntered { response = input}
        }
    }
    while (response == null) {
        Thread.sleep(50)
    }
    return response!!
}