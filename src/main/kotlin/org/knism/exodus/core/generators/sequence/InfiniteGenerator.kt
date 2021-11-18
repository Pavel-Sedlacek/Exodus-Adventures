package org.knism.exodus.core.generators.sequence

interface InfiniteGenerator<T> : Generator<T> {
    override fun hasNext(): Boolean = true
}