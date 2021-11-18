package org.knism.exodus.core.generators.sequence

interface Generator<T> {
    fun next(): T
    fun current(): T
    fun prev(): T

    fun hasNext(): Boolean

    fun reset(): Unit
    fun close(): Unit
}

