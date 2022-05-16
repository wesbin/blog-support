package delegates

fun main() {
    val broadcastStation = BroadcastStation()
    broadcastStation.viewers.add { notice ->
        println("NOTICE: [$notice]")
    }

    broadcastStation.notice = "delegates"
}