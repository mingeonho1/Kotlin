package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-20
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ num1, num2๊ฐ ๋งค๊ฐ๋ณ์ ์ฃผ์ด์ง๋๋ค. num1๊ณผ num2๋ฅผ ๊ณฑํ ๊ฐ์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(num1: Int, num2: Int) = num1 * num2


fun main() {
    val num1 = 27
    val num2 = 19
    val result = 513

    checkAnswer(solution(num1, num2) == result)
}