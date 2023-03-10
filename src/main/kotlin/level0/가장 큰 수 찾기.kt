package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-22
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ ๋ฐฐ์ด array๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
๊ฐ์ฅ ํฐ ์์ ๊ทธ ์์ ์ธ๋ฑ์ค๋ฅผ ๋ด์ ๋ฐฐ์ด์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(array: IntArray): IntArray {
    val max = array.maxOf { it }
    val index = array.indexOf(max)
    return intArrayOf(max, index)
}


fun main() {
    val array = intArrayOf(9, 10, 11, 8)
    val result = intArrayOf(11, 2)

    checkAnswer(solution(array).contentEquals(result))
}