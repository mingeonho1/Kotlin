package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-25
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์๊ฐ ๋ด๊ธด ๋ฆฌ์คํธ numList๊ฐ ์ฃผ์ด์ง ๋,
numList์ ์์ ์ค ์ง์์ ํ์์ ๊ฐ์๋ฅผ ๋ด์ ๋ฐฐ์ด์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(numList: IntArray): IntArray {
    var answer: IntArray = intArrayOf()
    answer = answer.plus(numList.filter { it % 2 == 0 }.size)
    answer = answer.plus(numList.filter { it % 2 == 1 }.size)
    return answer
}

fun main() {
    val numList = intArrayOf(1, 3, 5, 7)
    val result = intArrayOf(0, 4)

    checkAnswer(solution(numList).contentEquals(result))
}