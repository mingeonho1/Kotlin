package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-02-21
 * **/

/** λ¬Έμ  μ€λͺ
λ¨Έμ±μ΄λ μ§μ‘λ©΄μ²΄ λͺ¨μμ μμλ₯Ό νλ κ°μ§κ³  μλλ° μ΄ μμμ μ μ‘λ©΄μ²΄ λͺ¨μμ μ£Όμ¬μλ₯Ό μ΅λν λ§μ΄ μ±μ°κ³  μΆμ΅λλ€.
μμμ κ°λ‘, μΈλ‘, λμ΄κ° μ μ₯λμ΄μλ λ°°μ΄ boxμ μ£Όμ¬μ λͺ¨μλ¦¬μ κΈΈμ΄ μ μ nμ΄ λ§€κ°λ³μλ‘ μ£Όμ΄μ‘μ λ,
μμμ λ€μ΄κ° μ μλ μ£Όμ¬μμ μ΅λ κ°μλ₯Ό return νλλ‘ solution ν¨μλ₯Ό μμ±ν΄μ£ΌμΈμ. **/

private fun solution(box: IntArray, n: Int) = (box[0] / n) * (box[1] / n) * (box[2] / n)

fun main() {
    val box = intArrayOf(10, 8, 6)
    val n = 3
    val result = 12

    checkAnswer(solution(box, n) == result)
}