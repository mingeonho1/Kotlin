package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-14
 * **/

/** ๋ฌธ์  ์ค๋ช
๋ฌธ์์ด myString์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
myString ์์ ์๋ ์ซ์๋ง ๊ณจ๋ผ ์ค๋ฆ์ฐจ์ ์ ๋ ฌํ ๋ฆฌ์คํธ๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(myString: String) =
    myString.replace("[^0-9]".toRegex(), "").map { it.digitToInt() }.toIntArray().sortedArray()

fun main() {
    val myString = "hi12392"
    val result = intArrayOf(1, 2, 2, 3, 9)
    checkAnswer(solution(myString).contentEquals(result))
}