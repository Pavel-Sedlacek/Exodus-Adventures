package org.knism.exodus.konsole

import com.varabyte.konsole.foundation.input.Completions
import com.varabyte.konsole.foundation.input.input
import com.varabyte.konsole.foundation.input.onInputEntered
import com.varabyte.konsole.foundation.input.runUntilInputEntered
import com.varabyte.konsole.foundation.runUntilSignal
import com.varabyte.konsole.foundation.text.text
import com.varabyte.konsole.foundation.text.textLine
import com.varabyte.konsole.runtime.KonsoleApp
import com.varabyte.konsole.runtime.render.RenderScope

fun KonsoleApp.readString(message: String): String {
    var x = ""
    konsole { textLine(message); get() }.runUntilInputEntered { onInputEntered { x = input } }
    return x
}

fun RenderScope.get(completions: Completions? = null) {
    text("> "); input(completions)
}

fun KonsoleApp.readInt(message: String): Int {
    var x = ""
    konsole { textLine(message); get() }.runUntilSignal {
        onInputEntered {
            x = input
            if (x.toIntOrNull() != null) signal()
        }
        waitForSignal()
    }
    return x.toInt()
}

fun KonsoleApp.readOption(message: String, options: List<String>): String {
    var x = ""
    konsole { textLine(message); get(Completions(*(options.toTypedArray()))) }.runUntilSignal {
        onInputEntered {
            x = input
            if (options.contains(input)) signal()
        }
        waitForSignal()
    }
    return x
}

fun KonsoleApp.anyKey() {
    konsole {
        text("Press any key to continue..."); get()
    }.runUntilInputEntered()
}