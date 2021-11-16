package org.knism.exodus.konsole

import com.varabyte.konsole.foundation.konsoleApp
import com.varabyte.konsole.foundation.runUntilSignal
import com.varabyte.konsole.foundation.text.textLine
import com.varabyte.konsole.runtime.KonsoleBlock
import com.varabyte.konsole.runtime.render.RenderScope
import kotlin.properties.Delegates


open class Konsole private constructor() : Thread() {

    private var signal: () -> Unit = {}
    private var l: KonsoleBlock? = null
    private var block: (RenderScope).() -> Unit by Delegates.observable({ textLine("bruh") }) { _, _, _ ->
        l?.requestRerender()
    }

    override fun run() {
        konsoleApp {
            konsole {
                block()
            }.also { l = it }.runUntilSignal {
                signal = { signal() }
                waitForSignal()
            }
        }
    }

    fun append(block: RenderScope.() -> Unit) {
        val x = this.block
        this.block = {
            x()
            block()
        }
    }

    fun rerender() = this.l?.requestRerender()
    fun close() = signal()
    fun create(init: Konsole.() -> Unit) = this.init()
    fun clear() {
        this.block = {}
    }

    companion object : Konsole()
}