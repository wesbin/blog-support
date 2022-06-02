fun main () {
    val anyList: List<Number> = listOf(1, 2, 3)
    val wantArray: Array<Int> = anyList.map { it as Int }.toTypedArray()
}