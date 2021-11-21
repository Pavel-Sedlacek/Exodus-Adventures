package org.knism.exodus.konsole

import com.varabyte.konsole.foundation.konsoleApp
import com.varabyte.konsole.foundation.text.text
import com.varabyte.konsole.runtime.KonsoleApp


open class Konsole private constructor() : Thread() {

    private var appBlock: (KonsoleApp).() -> Unit = {
        this.konsole {
            text("Starting konsole")
        }.run()
    }

    override fun run() {
        konsoleApp() {
            appBlock()
        }
    }

    fun append(block: KonsoleApp.() -> Unit) {
        val x = this.appBlock
        this.appBlock = {
            x()
            block()
        }
    }

    companion object : Konsole()
}