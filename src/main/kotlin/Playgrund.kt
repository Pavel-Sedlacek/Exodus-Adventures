import com.varabyte.konsole.foundation.input.Completions
import com.varabyte.konsole.foundation.input.input
import com.varabyte.konsole.foundation.input.onInputEntered
import com.varabyte.konsole.foundation.input.runUntilInputEntered
import com.varabyte.konsole.foundation.text.text
import com.varabyte.konsole.foundation.text.textLine
import org.knism.exodus.konsole.Konsole
import org.knism.exodus.konsole.animations.Animation
import org.knism.exodus.konsole.animations.animate
import org.knism.exodus.konsole.interactions.select
import org.knism.exodus.konsole.interactions.yesOrNo
import org.knism.exodus.konsole.time.millis
import org.knism.exodus.predicates.AnimationPredicate

fun main() {

    Konsole.start()
    
    Konsole.select("choose wisely", listOf("idiot", "wisely", "potato", "b")).log()

}

fun Any?.log() {
    println(this)
}