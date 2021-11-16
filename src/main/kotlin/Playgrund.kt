import org.knism.exodus.core.map.Map
import org.knism.exodus.core.map.Position

fun main() {
    val x = Map.newMap()

    x.revealAround(Position(0, 0, 0))

    x.map.map {
        it.key.let { it.x to it.y } to it.value.levels.map { it }
    }.log()
}

fun List<Any>.log() {
    for (i in this) println(i)
}
