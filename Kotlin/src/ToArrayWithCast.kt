fun main () {
    val anyList: List<Any> = listOf(0, 1, 2, 3)
    val strArray: Array<String> = anyList.map { it as String }.toTypedArray()
}