import com.varabyte.konsole.foundation.konsoleApp
import org.knism.exodus.konsole.readInt
import org.knism.exodus.konsole.readOption

fun main() = konsoleApp {
    readInt("hey").log()
    readOption("bruh", listOf("x", "d", "f"))
}

fun Any?.log() = println(this)

