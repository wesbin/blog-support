package delegates

fun main() {
    val blog = Blog()
    blog.followers.add { notice ->
        println("NOTICE: [$notice]")
    }

    blog.notice = "delegates"
}