package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-08
 * **/

/** ๋ฌธ์  ์ค๋ช
๋จธ์ฑ์ด๋ ํ์ด์ ์ซ์ 7์ ๊ฐ์ฅ ์ข์ํฉ๋๋ค.
์ ์ ๋ฐฐ์ด array๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, 7์ด ์ด ๋ช ๊ฐ ์๋์ง return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/


private fun solution(array: IntArray) = array.map { it.toString().map { it } }.flatten().count { it == '7' }

//private fun solution(array: IntArray) = array.joinToString("").count { it == '7' }
fun main() {
    val array = intArrayOf(7, 77, 17)
    val result = 4

    checkAnswer(solution(array) == result)
}