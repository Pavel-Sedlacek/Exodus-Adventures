import com.varabyte.konsole.foundation.konsoleApp
import com.varabyte.konsole.terminal.VirtualTerminal
import org.knism.exodus.game.Game
import org.knism.exodus.konsole.Konsole
import kotlin.concurrent.thread

fun main() = konsoleApp(
    VirtualTerminal.create(
        title = "Exodus Adventures",
        fontSize = 16,
    )
) {
    val x = Konsole(this)
    val game = Game()

    thread { x.renderBlock() }

    while (x.isActive) {
        Thread.sleep(100)
    }
}
