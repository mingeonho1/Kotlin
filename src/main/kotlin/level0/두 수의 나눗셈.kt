package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-01-20
 * **/

/** λ¬Έμ  μ€λͺ
μ μ num1κ³Ό num2κ° λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ, num1μ num2λ‘ λλ κ°μ 1,000μ κ³±ν ν μ μ λΆλΆμ return νλλ‘ soltuion ν¨μλ₯Ό μμ±ν΄μ£ΌμΈμ. **/

private fun solution(num1: Int, num2: Int) = (num1 * 1000) / num2


fun main() {
    val num1 = 1
    val num2 = 16
    val result = 62

    checkAnswer(solution(num1, num2) == result)
}