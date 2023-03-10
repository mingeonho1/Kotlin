package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-27
 * **/

/** ๋ฌธ์  ์ค๋ช
์ฝ์์ ๊ฐ์๊ฐ ์ธ ๊ฐ ์ด์์ธ ์๋ฅผ ํฉ์ฑ์๋ผ๊ณ  ํฉ๋๋ค.
์์ฐ์ n์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋ n์ดํ์ ํฉ์ฑ์์ ๊ฐ์๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(n: Int): Int {
    var answer: Int = 0
    for (i in 1..n) {
        val count = (1..i).count { i % it == 0 }
        if (count > 2) {
            answer++
        }
    }
    return answer
}

fun main() {
    val n = 10
    val result = 5

    checkAnswer(solution(n) == result)
}