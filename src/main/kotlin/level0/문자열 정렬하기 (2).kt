package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-24
 * **/

/** ๋ฌธ์  ์ค๋ช
์์ด ๋์๋ฌธ์๋ก ์ด๋ฃจ์ด์ง ๋ฌธ์์ด myString์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
myString์ ๋ชจ๋ ์๋ฌธ์๋ก ๋ฐ๊พธ๊ณ  ์ํ๋ฒณ ์์๋๋ก ์ ๋ ฌํ ๋ฌธ์์ด์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(myString: String) = myString.lowercase().toCharArray().apply { sort() }.joinToString("")


fun main() {
    val myString = "heLLo"
    val result = "ehllo"

    checkAnswer(solution(myString) == result)
}