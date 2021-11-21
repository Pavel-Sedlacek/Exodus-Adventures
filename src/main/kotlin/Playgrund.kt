import org.knism.exodus.core.entities.player.Inventory
import org.knism.exodus.core.entities.player.Player
import org.knism.exodus.core.entities.stats.*
import org.knism.exodus.core.items.weapons.Hands
import org.knism.exodus.konsole.Konsole
import org.knism.exodus.konsole.interactions.selectInput
import org.knism.exodus.konsole.interactions.yesOrNo

fun main() {
    Konsole.start()
    val exodus =
        Player(
            "",
            PlayerStats(
                Level(0, 0, 30, LevelRequirementsScaling(20)),
                Health(0, 100),
                Armor(0, 100),
                Mana(0, 20)),
            Inventory(),
            Hands())

//    println(Konsole.yesOrNo("bruh?"))
    println(Konsole.selectInput("choose wisely", listOf("wisely", "poorly", "bruh")))
}
