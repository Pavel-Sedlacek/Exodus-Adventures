package org.knism.exodus.predicates

import java.time.Duration

class AnimationPredicate(val predicate: (elapsed: Duration) -> Boolean)