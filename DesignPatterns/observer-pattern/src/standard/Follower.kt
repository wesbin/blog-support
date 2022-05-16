package standard

import Observer

class Follower(private val id: String, private var blog: Blog): Observer {

    override fun update() {
        println("ID: [$id], NOTICE: [${blog.notice}]")
    }
}