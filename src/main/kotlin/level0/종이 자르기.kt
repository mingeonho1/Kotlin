package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-13
 * **/

/** ๋ฌธ์  ์ค๋ช
๋จธ์ฑ์ด๋ ํฐ ์ข์ด๋ฅผ 1 x 1 ํฌ๊ธฐ๋ก ์๋ฅด๋ ค๊ณ  ํฉ๋๋ค.
์๋ฅผ ๋ค์ด 2 x 2 ํฌ๊ธฐ์ ์ข์ด๋ฅผ 1 x 1 ํฌ๊ธฐ๋ก ์๋ฅด๋ ค๋ฉด ์ต์ ๊ฐ์์ง ์ธ ๋ฒ์ด ํ์ํฉ๋๋ค.

์ ์ M, N์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, M x N ํฌ๊ธฐ์ ์ข์ด๋ฅผ ์ต์๋ก ๊ฐ์์ง ํด์ผํ๋ ํ์๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์.**/

private fun solution(M: Int, N: Int) = (M - 1) + ((N - 1) * M)

fun main() {
    val M = 2
    val N = 5
    val result = 9

    checkAnswer(solution(M, N) == result)
}
