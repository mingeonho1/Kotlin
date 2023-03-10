package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-01-27
 * **/

/** ๋ฌธ์  ์ค๋ช
๋จธ์ฑ์ด๋ค ์ท๊ฐ๊ฒ๋ 10๋ง ์ ์ด์ ์ฌ๋ฉด 5%, 30๋ง ์ ์ด์ ์ฌ๋ฉด 10%, 50๋ง ์ ์ด์ ์ฌ๋ฉด 20%๋ฅผ ํ ์ธํด์ค๋๋ค.
๊ตฌ๋งคํ ์ท์ ๊ฐ๊ฒฉ price๊ฐ ์ฃผ์ด์ง ๋, ์ง๋ถํด์ผ ํ  ๊ธ์ก์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(price: Int) = when {
    price >= 500000 -> price * 0.8
    price >= 300000 -> price * 0.9
    price >= 100000 -> price * 0.95
    else -> price
}.toInt()

fun main() {
    val price = 580000
    val result = 464000

    checkAnswer(solution(price) == result)
}