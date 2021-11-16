package org.knism.exodus.predicates

import java.time.Duration

class AnimationPredicate(val predicate: (frame: String, elapsed: Duration) -> Boolean)