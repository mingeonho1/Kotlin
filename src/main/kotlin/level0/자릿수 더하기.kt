package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-09
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ n์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋ n์ ๊ฐ ์๋ฆฌ ์ซ์์ ํฉ์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์ **/

private fun solution(n: Int) = n.toString().map { it.digitToInt() }.sum()


fun main() {
    val n = 930211
    val result = 16
    checkAnswer(solution(n) == result)
}