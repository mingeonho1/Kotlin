package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-09
 * **/

/** ๋ฌธ์  ์ค๋ช
๋ฌธ์์ด str1, str2๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง๋๋ค.
str1 ์์ str2๊ฐ ์๋ค๋ฉด 1์ ์๋ค๋ฉด 2๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(str1: String, str2: String) = if (str1.contains(str2)) 1 else 2


fun main() {
    val str1 = "ab6CDE443fgh22iJKlmn1o"
    val str2 = "6CD"
    val result = 1
    checkAnswer(solution(str1, str2) == result)
}