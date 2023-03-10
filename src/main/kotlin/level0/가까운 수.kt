package level0

import kotlin.math.abs

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-02
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ ๋ฐฐ์ด array์ ์ ์ n์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
array์ ๋ค์ด์๋ ์ ์ ์ค n๊ณผ ๊ฐ์ฅ ๊ฐ๊น์ด ์๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(array: IntArray, n: Int) = array.sorted().minWithOrNull(compareBy { abs(it - n) })!!


fun main() {
    val array = intArrayOf(3, 10, 28)
    val n = 20
    val result = 28

    checkAnswer(solution(array, n) == result)
}