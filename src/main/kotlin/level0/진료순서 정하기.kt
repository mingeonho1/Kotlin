package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-03
 * **/

/** ๋ฌธ์  ์ค๋ช
์ธ๊ณผ์์ฌ ๋จธ์ฑ์ด๋ ์๊ธ์ค์ ์จ ํ์์ ์๊ธ๋๋ฅผ ๊ธฐ์ค์ผ๋ก ์ง๋ฃ ์์๋ฅผ ์ ํ๋ ค๊ณ  ํฉ๋๋ค.
์ ์ ๋ฐฐ์ด emergency๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋ ์๊ธ๋๊ฐ ๋์ ์์๋๋ก ์ง๋ฃ ์์๋ฅผ ์ ํ ๋ฐฐ์ด์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(emergency: IntArray) = emergency.map { emergency.sortedDescending().indexOf(it) + 1 }.toIntArray()

fun main() {
    val emergency = intArrayOf(30, 10, 23, 6, 100)
    val result = intArrayOf(2, 4, 3, 5, 1)

    checkAnswer(solution(emergency).contentEquals(result))
}