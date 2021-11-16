package org.knism.exodus.konsole.animations

import org.knism.exodus.konsole.KonsoleSettings
import org.knism.exodus.predicates.AnimationPredicate


open class Animation(val end: AnimationPredicate, val framerate: Int = KonsoleSettings.framerate, val animation: List<String>)

class AsyncAnimation(
    end: AnimationPredicate,
    framerate: Int = KonsoleSettings.framerate,
    animation: List<String>,
    val finalFrame: String
) :
    Animation(end, framerate, animation)
