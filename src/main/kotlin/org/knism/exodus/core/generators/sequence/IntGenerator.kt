package org.knism.exodus.core.generators.sequence

import org.knism.exodus.core.exception.GeneratorLimitExceededException

class IntGenerator(private val negativeValues: Boolean = false) : Generator<Int> {
    var x = if (negativeValues) Int.MIN_VALUE else 0

    override fun next(): Int = if (hasNext()) x++
    else throw GeneratorLimitExceededException()

    override fun current(): Int = x

    override fun prev(): Int = x - 1

    override fun reset() {
        x = if (negativeValues) Int.MIN_VALUE else 0
    }

    override fun close() {}

    override fun hasNext(): Boolean = x < Int.MAX_VALUE

}