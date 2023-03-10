package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-03-13
 * **/

/** λ¬Έμ  μ€λͺ
2μ°¨μ μ’ν νλ©΄μ λ³μ΄ μΆκ³Ό ννν μ§μ¬κ°νμ΄ μμ΅λλ€.
μ§μ¬κ°ν λ€ κΌ­μ§μ μ μ’ν [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]κ° λ΄κ²¨μλ λ°°μ΄ dotsκ° λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ,
μ§μ¬κ°νμ λμ΄λ₯Ό return νλλ‘ solution ν¨μλ₯Ό μμ±ν΄λ³΄μΈμ. **/

private fun solution(dots: Array<IntArray>): Int {
    var list = mutableListOf<Int>()
    for (dot in dots) {
        list += (dot[0] + dot[1])
    }
    val maxIdx = list.indexOf(list.maxOf { it })
    val minIdx = list.indexOf(list.minOf { it })

    return (dots[maxIdx][0] - dots[minIdx][0]) * (dots[maxIdx][1] - dots[minIdx][1])
}

fun main() {
    try {
        val dots = arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2), intArrayOf(1, 2))
        val result = 1

        checkAnswer(solution(dots) == result)
    } catch (e: Exception) {
        println(e)
    }
}
