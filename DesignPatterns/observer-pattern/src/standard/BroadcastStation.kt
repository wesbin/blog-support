package standard

import Observable
import Observer

class BroadcastStation: Observable {

    override val observers: ArrayList<Observer> = ArrayList()
    var notice = ""
        set(value) {
            field = value
            sendUpdateEvent()
        }
}