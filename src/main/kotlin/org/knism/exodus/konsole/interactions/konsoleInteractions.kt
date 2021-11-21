package org.knism.exodus.konsole.interactions

import com.varabyte.konsole.foundation.input.Completions
import com.varabyte.konsole.foundation.input.input
import com.varabyte.konsole.foundation.text.text
import com.varabyte.konsole.foundation.text.textLine
import org.knism.exodus.konsole.Konsole

fun Konsole.yesOrNo(question: String): YesNo {
    var response: Boolean? = null
    append {
        onInput = { input ->
            response = "yes".startsWith(input.lowercase())
        }
        textLine(question)
        text("> "); input(Completions("yes", "no"))
    }

    while (response == null) {Thread.sleep(50)}
    return if (response!!) YesNo.YES else YesNo.NO
}

fun Konsole.selectInput(question: String, options: List<String>): String {
    var response: String? = null
    onInput = { input ->
        println("stan se zmrde")
        response = input
    }
    append {
        textLine(question)
        textLine(options.joinToString(", ", "[", "]"))
        text("> "); input(Completions(*options.toTypedArray()))
    }

    clearAfterInput()

    // TODO fix return wait for response
    while (response == null) {Thread.sleep(50)}
    return response!!
}

