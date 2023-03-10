package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-20
 * **/

/** ๋ฌธ์  ์ค๋ช
๋จธ์ฑ์ด๋ ํ๊ต์์ ํค ์์ผ๋ก ์ค์ ์ค ๋ ๋ช ๋ฒ์งธ๋ก ์์ผ ํ๋์ง ๊ถ๊ธํด์ก์ต๋๋ค.
๋จธ์ฑ์ด๋ค ๋ฐ ์น๊ตฌ๋ค์ ํค๊ฐ ๋ด๊ธด ์ ์ ๋ฐฐ์ด array์ ๋จธ์ฑ์ด์ ํค height๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
๋จธ์ฑ์ด๋ณด๋ค ํค ํฐ ์ฌ๋ ์๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(array: IntArray, height: Int) = array.filter { it > height }.size


fun main() {
    val array = intArrayOf(149, 180, 192, 170)
    val height = 167
    val result = 3

    checkAnswer(solution(array, height) == result)
}