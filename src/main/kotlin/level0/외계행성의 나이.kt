package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-02-23
 * **/

/** λ¬Έμ  μ€λͺ
μ°μ£Όμ¬νμ νλ λ¨Έμ±μ΄λ μμ§ κ³ μ₯μΌλ‘ PROGRAMMERS-962 νμ±μ λΆμμ°©νκ² λμ΅λλ€.
μκ΅­μ¬μ¬μμ λμ΄λ₯Ό λ§ν΄μΌ νλλ°, PROGRAMMERS-962 νμ±μμλ λμ΄λ₯Ό μνλ²³μΌλ‘ λ§νκ³  μμ΅λλ€.
aλ 0, bλ 1, cλ 2, ..., jλ 9μλλ€.
μλ₯Ό λ€μ΄ 23μ΄μ cd, 51μ΄μ fbλ‘ ννν©λλ€.
λμ΄ ageκ° λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ PROGRAMMER-962μ λμ΄λ₯Ό returnνλλ‘ solution ν¨μλ₯Ό μμ±ν΄μ£ΌμΈμ. **/

private fun solution(age: Int) = age.toString().map { (it.code + 49).toChar() }.joinToString("")


fun main() {
    val age = 23
    val result = "cd"
    
    checkAnswer(solution(age) == result)
}