package org.knism.exodus.konsole.time

import java.time.Duration

fun millis(time: Long): Duration = Duration.ofMillis(time)
fun nanos(time: Long): Duration = Duration.ofNanos(time)

fun nowMillis(): Long = System.currentTimeMillis()
fun nowNanos(): Long = System.nanoTime()

fun Duration.mil() = this.toMillis()