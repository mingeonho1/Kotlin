package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-27
 * **/

/** ๋ฌธ์  ์ค๋ช
๋จธ์ฑ์ด๋ ํ ๋จธ๋๊ป ์์  ์ถํ ํธ์ง๋ฅผ ์ฐ๋ ค๊ณ  ํฉ๋๋ค.
ํ ๋จธ๋๊ฐ ๋ณด์๊ธฐ ํธํ๋๋ก ๊ธ์ ํ ์ ํ ์๋ฅผ ๊ฐ๋ก 2cm ํฌ๊ธฐ๋ก ์ ์ผ๋ ค๊ณ  ํ๋ฉฐ, ํธ์ง๋ฅผ ๊ฐ๋ก๋ก๋ง ์ ์ ๋,
์ถํ ๋ฌธ๊ตฌ message๋ฅผ ์ ๊ธฐ ์ํด ํ์ํ ํธ์ง์ง์ ์ต์ ๊ฐ๋ก๊ธธ์ด๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(message: String): Int {
    var answer = 0
    for (me in message) {
        answer += 2
    }
    return answer
}

//private fun solution(message: String) = message.length * 2

fun main() {
    val message = "I love you~"
    val result = 22

    checkAnswer(solution(message) == result)
}