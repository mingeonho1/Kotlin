package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-01-27
 * **/

/** λ¬Έμ  μ€λͺ
μ€μκ°μ μ΄λ€ μ£Όμ΄μ§ κ°λ€μ ν¬κΈ°μ μμλλ‘ μ λ ¬νμ λ κ°μ₯ μ€μμ μμΉνλ κ°μ μλ―Έν©λλ€.
μλ₯Ό λ€μ΄ 1, 2, 7, 10, 11μ μ€μκ°μ 7μλλ€.
μ μ λ°°μ΄ arrayκ° λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ, μ€μκ°μ return νλλ‘ solution ν¨μλ₯Ό μμ±ν΄λ³΄μΈμ. **/

private fun solution(array: IntArray) = array.sortedArray()[array.size / 2]

fun main() {
    val numbers = intArrayOf(9, -1, 0)
    val result = 0

    checkAnswer(solution(numbers) == result)
}