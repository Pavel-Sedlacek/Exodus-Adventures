package org.knism.exodus.konsole.threader

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

open class ThreadRunner {
    fun run(block: suspend () -> Unit) = thread {
        runBlocking {
            launch {
                block()
            }
        }
    }


    companion object : ThreadRunner()
}