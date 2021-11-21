package org.knism.exodus.konsole.animations

import com.varabyte.konsole.foundation.anim.konsoleAnimOf
import com.varabyte.konsole.foundation.text.text
import org.knism.exodus.konsole.Konsole
import org.knism.exodus.konsole.time.millis
import org.knism.exodus.konsole.time.nowNanos


fun Konsole.animate(animation: Animation) = Konsole.append {
    var finished = false
    val anim = konsoleAnimOf(animation.animation, millis(1000L / animation.framerate))
    val begin = nowNanos()
    konsole {
        if (!finished) text(anim)
        else text(animation.endFrame)
    }.run {
        while (animation.end.predicate(millis((nowNanos() - begin) / 1_000_000))) print("")
        finished = true
        rerender()
    }
}