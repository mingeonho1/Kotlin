package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-01-20
 * **/

/** λ¬Έμ  μ€λͺ
μ μ num1, num2κ° λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ, num1μ num2λ‘ λλ λͺ«μ return νλλ‘ solution ν¨μλ₯Ό μμ±ν΄μ£ΌμΈμ. **/

private fun solution(num1: Int, num2: Int) = num1 / num2


fun main() {
    val num1 = 10
    val num2 = 5
    val result = 2

    checkAnswer(solution(num1, num2) == result)
}