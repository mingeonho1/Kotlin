package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-20
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์๊ฐ ๋ค์ด ์๋ ๋ฐฐ์ด numList๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง๋๋ค.
numList์ ์์์ ์์๋ฅผ ๊ฑฐ๊พธ๋ก ๋ค์ง์ ๋ฐฐ์ด์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(numList: IntArray) = numList.reversedArray()


fun main() {
    val numList = intArrayOf(1, 0, 1, 1, 1, 3, 5)
    val result = intArrayOf(5, 3, 1, 1, 1, 0, 1)
    
    checkAnswer(solution(numList).contentEquals(result))
}