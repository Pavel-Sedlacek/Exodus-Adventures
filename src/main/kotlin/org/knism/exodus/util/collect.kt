package org.knism.exodus.util

fun <T> collect(times: Int, block: () -> T): List<T> {
    val c = mutableListOf<T>()
    repeat(times) {
        c.add(block())
    }
    return c
}