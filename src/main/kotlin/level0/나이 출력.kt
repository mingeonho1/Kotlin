package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-20
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ num1, num2๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, num1๋ฅผ num2๋ก ๋๋ ๋๋จธ์ง๋ฅผ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(age: Int) = 2022 - (age - 1)


fun main() {
    val age = 40
    val result = 1983

    checkAnswer(solution(age) == result)
}