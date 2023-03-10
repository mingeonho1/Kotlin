package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-02
 * **/

/** ๋ฌธ์  ์ค๋ช
iํฉํ ๋ฆฌ์ผ (i!)์ 1๋ถํฐ i๊น์ง ์ ์์ ๊ณฑ์ ์๋ฏธํฉ๋๋ค.
์๋ฅผ๋ค์ด 5! = 5 * 4 * 3 * 2 * 1 = 120 ์๋๋ค.
์ ์ n์ด ์ฃผ์ด์ง ๋ ๋ค์ ์กฐ๊ฑด์ ๋ง์กฑํ๋ ๊ฐ์ฅ ํฐ ์ ์ i๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(n: Int): Int {
    var answer: Int = 1
    for (i in 1..10) {
        answer *= i
        if (answer == n) {
            return i
        } else if (answer > n) {
            return i - 1
        }
    }
    return 1
}


fun main() {
    val n = 3628800
    val result = 10

    checkAnswer(solution(n) == result)
}