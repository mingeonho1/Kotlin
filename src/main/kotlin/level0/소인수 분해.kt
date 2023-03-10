package level0

/**
 * Β© DEV MING π»
 * Current date: 2023-03-08
 * **/

/** λ¬Έμ  μ€λͺ
μμΈμλΆν΄λ μ΄λ€ μλ₯Ό μμλ€μ κ³±μΌλ‘ νννλ κ²μλλ€.
μλ₯Ό λ€μ΄ 12λ₯Ό μμΈμ λΆν΄νλ©΄ 2 * 2 * 3 μΌλ‘ λνλΌ μ μμ΅λλ€.
λ°λΌμ 12μ μμΈμλ 2μ 3μλλ€.
μμ°μ nμ΄ λ§€κ°λ³μλ‘ μ£Όμ΄μ§ λ nμ μμΈμλ₯Ό μ€λ¦μ°¨μμΌλ‘ λ΄μ λ°°μ΄μ returnνλλ‘ solution ν¨μλ₯Ό μμ±ν΄μ£ΌμΈμ. **/


private fun solution(n: Int): IntArray {
    var num = n
    var cnt = 2
    val intSet: MutableSet<Int> = mutableSetOf()
    while (num > 1) {
        if (num % cnt == 0) {
            intSet.add(cnt)
            num /= cnt
        } else {
            cnt++
        }
    }
    println(intSet)
    return intSet.toIntArray().sortedArray()
}


fun main() {
    val n = 420
    val result = intArrayOf(2, 3, 5, 7)

    checkAnswer(solution(n).contentEquals(result))
}