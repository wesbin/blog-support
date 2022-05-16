package standard

fun main() {

    val blog = Blog()
    blog.add(Follower("Kotlin", blog))
    blog.add(Follower("Observer", blog))

    blog.notice = "PATTERN"
}