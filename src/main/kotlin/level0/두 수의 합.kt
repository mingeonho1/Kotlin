package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-20
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ num1๊ณผ num2๊ฐ ์ฃผ์ด์ง ๋, num1๊ณผ num2์ ํฉ์ returnํ๋๋ก soltuion ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(num1: Int, num2: Int) = num1 + num2


fun main() {
    val num1 = 2
    val num2 = 3
    val result = 5

    checkAnswer(solution(num1, num2) == result)
}