package level0

import kotlin.math.sqrt

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-10
 * **/

/** ๋ฌธ์  ์ค๋ช
์ด๋ค ์์ฐ์๋ฅผ ์ ๊ณฑํ์ ๋ ๋์ค๋ ์ ์๋ฅผ ์ ๊ณฑ์๋ผ๊ณ  ํฉ๋๋ค.
์ ์ n์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, n์ด ์ ๊ณฑ์๋ผ๋ฉด 1์ ์๋๋ผ๋ฉด 2๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(n: Int): Int {
    val num = sqrt(n.toDouble()).toInt()
    return if (n % num == 0) 1 else 2
}

fun main() {
    val n = 144
    val result = 1

    checkAnswer(solution(n) == result)
}