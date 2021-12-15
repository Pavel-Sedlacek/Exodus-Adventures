package org.knism.exodus.time

import java.time.Duration
import kotlin.concurrent.thread

open class ExodusClock {

    val start = System.nanoTime()

    fun elapsed(): Long = now() - start

    fun schedule(duration: Duration, block: () -> Unit) {
        thread {
            Thread.sleep(duration.mil())
            block()
        }
    }

    private fun now(): Long = System.nanoTime()

    companion object : ExodusClock()
}