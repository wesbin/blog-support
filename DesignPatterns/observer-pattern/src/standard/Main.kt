package standard

fun main() {

    val broadcastStation = BroadcastStation()
    broadcastStation.add(Viewer("Kotlin", broadcastStation))
    broadcastStation.add(Viewer("Observer", broadcastStation))

    broadcastStation.notice = "PATTERN"
}