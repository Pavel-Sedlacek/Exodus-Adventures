package org.knism.exodus.konsole.animations

import com.varabyte.konsole.foundation.text.text
import com.varabyte.konsole.foundation.text.textLine
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.knism.exodus.konsole.Konsole
import java.time.Duration


fun Konsole.animate(animation: Animation) {
    var index = 0
    Konsole.append {
        text(animation.animation[index % animation.animation.size])
    }
    val begin = System.nanoTime()
    while (true) {
        Thread.sleep(1000L / animation.framerate)
        index++
        Konsole.rerender()
        if (animation.end.predicate(
                animation.animation[index % animation.animation.size],
                Duration.ofMillis((System.nanoTime() - begin) / 1_000_000)
            )
        ) break
    }
}

suspend fun Konsole.asyncAnimate(animation: Animation) {
    var index = 0
    Konsole.append {
        textLine(animation.animation[index % animation.animation.size])
    }
    val begin = System.nanoTime()
    while (true) {
        delay(1000L / animation.framerate)
        index++
        Konsole.rerender()
        if (animation.end.predicate(
                animation.animation[index % animation.animation.size],
                Duration.ofMillis((System.nanoTime() - begin) / 1_000_000)
            )
        ) break
    }
}

suspend fun asyncAnimate(animation: Animation) = coroutineScope {
    Konsole.asyncAnimate(animation)
}