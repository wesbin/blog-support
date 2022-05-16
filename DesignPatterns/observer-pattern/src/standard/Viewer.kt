package standard

import Observer

class Viewer(private val id: String, private var broadcastStation: BroadcastStation): Observer {

    override fun update() {
        println("ID: [$id], NOTICE: [${broadcastStation.notice}]")
    }
}