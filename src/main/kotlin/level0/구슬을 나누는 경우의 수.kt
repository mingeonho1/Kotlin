package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-12
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ ๋ฐฐ์ด array์ ์ ์ n์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
array์ ๋ค์ด์๋ ์ ์ ์ค n๊ณผ ๊ฐ์ฅ ๊ฐ๊น์ด ์๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun combination(n: Int, r: Int): Int {
    return if (r == 0 || n == r) {
        1
    } else {
        combination(n - 1, r - 1) +
                combination(n - 1, r)
    }
}

private fun solution(balls: Int, share: Int): Int {
    return combination(balls, share)
}


fun main() {
    val balls = 5
    val share = 3
    val result = 10

    checkAnswer(solution(balls, share) == result)
}