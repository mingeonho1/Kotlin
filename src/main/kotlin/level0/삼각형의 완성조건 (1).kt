package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-25
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ๋ถ ์ธ ๊ฐ๋ก ์ผ๊ฐํ์ ๋ง๋ค๊ธฐ ์ํด์๋ ๋ค์๊ณผ ๊ฐ์ ์กฐ๊ฑด์ ๋ง์กฑํด์ผ ํฉ๋๋ค.
- ๊ฐ์ฅ ๊ธด ๋ณ์ ๊ธธ์ด๋ ๋ค๋ฅธ ๋ ๋ณ์ ๊ธธ์ด์ ํฉ๋ณด๋ค ์์์ผ ํฉ๋๋ค.
์ผ๊ฐํ์ ์ธ ๋ณ์ ๊ธธ์ด๊ฐ ๋ด๊ธด ๋ฐฐ์ด sides์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง๋๋ค.
์ธ ๋ณ์ผ๋ก ์ผ๊ฐํ์ ๋ง๋ค ์ ์๋ค๋ฉด 1, ๋ง๋ค ์ ์๋ค๋ฉด 2๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(sides: IntArray): Int {
    val sortedSides: IntArray = sides.sortedArray()
    return if (sortedSides[0] + sortedSides[1] > sortedSides[2]) 1 else 2
}


fun main() {
    val sides = intArrayOf(199, 72, 222)
    val result = 1

    checkAnswer(solution(sides) == result)
}