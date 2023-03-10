package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-25
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ n์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, n ์ดํ์ ํ์๊ฐ ์ค๋ฆ์ฐจ์์ผ๋ก ๋ด๊ธด ๋ฐฐ์ด์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(n: Int) = (0..n).filter { it % 2 == 1 }.toIntArray()

fun main() {
    val n = 15
    val result = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15)

    checkAnswer(solution(n).contentEquals(result))
}