package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-13
 * **/

/** ๋ฌธ์  ์ค๋ช
์ด๋ค ์ธ๊ท ์ 1์๊ฐ์ ๋๋ฐฐ๋งํผ ์ฆ์ํ๋ค๊ณ  ํฉ๋๋ค.
์ฒ์ ์ธ๊ท ์ ๋ง๋ฆฌ์ n๊ณผ ๊ฒฝ๊ณผํ ์๊ฐ t๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋ t์๊ฐ ํ ์ธ๊ท ์ ์๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(n: Int, t: Int): Int {
    var answer: Int = n
    for (i in 1..t) {
        answer *= 2
    }
    return answer
}


fun main() {
    val n = 7
    val t = 15
    val result = 229376

    checkAnswer(solution(n, t) == result)
}