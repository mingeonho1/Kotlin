package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-01-20
 * **/

/** λ¬Έμ  μ€λͺ
λ¨Έμ±μ΄λ μΆμ΄ λ μλ μμ΄μ€ μλ©λ¦¬μΉ΄λΈλ§ λ§μ­λλ€.
μμ΄μ€ μλ©λ¦¬μΉ΄λΈλ νμμ 5,500μμλλ€.
λ¨Έμ±μ΄κ° κ°μ§κ³  μλ λ moneyκ° λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ,
λ¨Έμ±μ΄κ° μ΅λλ‘ λ§μ€ μ μλ μλ©λ¦¬μΉ΄λΈμ μ μμ λ¨λ λμ μμλλ‘ λ΄μ λ°°μ΄μ return νλλ‘ solution ν¨μλ₯Ό μμ±ν΄λ³΄μΈμ. **/

private fun solution(money: Int) = intArrayOf(money / 5500, money % 5500)


fun main() {
    val money = 15000
    val result = intArrayOf(2, 4000)
    
    checkAnswer(solution(money).contentEquals(result))
}