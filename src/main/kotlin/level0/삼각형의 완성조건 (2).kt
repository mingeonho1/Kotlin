package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-12
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ๋ถ ์ธ ๊ฐ๋ก ์ผ๊ฐํ์ ๋ง๋ค๊ธฐ ์ํด์๋ ๋ค์๊ณผ ๊ฐ์ ์กฐ๊ฑด์ ๋ง์กฑํด์ผ ํฉ๋๋ค.

๊ฐ์ฅ ๊ธด ๋ณ์ ๊ธธ์ด๋ ๋ค๋ฅธ ๋ ๋ณ์ ๊ธธ์ด์ ํฉ๋ณด๋ค ์์์ผ ํฉ๋๋ค.
์ผ๊ฐํ์ ๋ ๋ณ์ ๊ธธ์ด๊ฐ ๋ด๊ธด ๋ฐฐ์ด sides์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง๋๋ค.
๋๋จธ์ง ํ ๋ณ์ด ๋  ์ ์๋ ์ ์์ ๊ฐ์๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(sides: IntArray): Int {
    val bigValue = Math.max(sides[0], sides[1])
    val smallValue = Math.min(sides[0], sides[1])

    val lowLimit = bigValue - smallValue
    val highLimit = bigValue + smallValue

    return highLimit - lowLimit - 1
}


fun main() {
    val sides = intArrayOf(3, 6)
    val result = 5

    checkAnswer(solution(sides) == result)
}