package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-02-07
 * **/

/** λ¬Έμ  μ€λͺ
μμμμ΄λ λ κ°μ μ«μλ₯Ό μμλ₯Ό μ νμ¬ μ§μ§μ΄ λνλΈ μμΌλ‘ (a, b)λ‘ νκΈ°ν©λλ€.
μμ°μ nμ΄ λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ λ μ«μμ κ³±μ΄ nμΈ μμ°μ μμμμ κ°μλ₯Ό returnνλλ‘ solution ν¨μλ₯Ό μμ±ν΄μ£ΌμΈμ. **/

private fun solution(n: Int): Int {
    var answer: Int = 0
    for (i in 1..n) {
        val a = n / i
        if (i * a == n) {
            answer++
        }
    }
    return answer
}

//private fun solution(n: Int) = (1..n).count { n % it == 0 }

fun main() {
    val n = 20
    val result = 6

    checkAnswer(solution(n) == result)
}