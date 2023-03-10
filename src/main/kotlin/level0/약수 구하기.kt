package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-24
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ n์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, n์ ์ฝ์๋ฅผ ์ค๋ฆ์ฐจ์์ผ๋ก ๋ด์ ๋ฐฐ์ด์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    for (i in 1..n) {
        if (n % i == 0) {
            answer += i
        }
    }
    return answer
}

//private fun solution(n: Int) = (1..n).filter { n % it == 0 }

fun main() {
    val n = 24
    val result = intArrayOf(1, 2, 3, 4, 6, 8, 12, 24)

    checkAnswer(solution(n).contentEquals(result))
}