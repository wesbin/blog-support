package delegates

import kotlin.properties.Delegates

class BroadcastStation {
    val viewers = mutableListOf<(String) -> Unit>()

    var notice: String by Delegates.observable("") { _, _, newValue ->
        viewers.forEach { it(newValue) }
    }
}