package delegates

import kotlin.properties.Delegates

class Blog {
    val followers = mutableListOf<(String) -> Unit>()

    var notice: String by Delegates.observable("") { property, oldValue, newValue ->
        followers.forEach { it(newValue) }
    }
}