package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-10
 * **/

/** ๋ฌธ์  ์ค๋ช
์์ด์์  a, e, i, o, u ๋ค์ฏ ๊ฐ์ง ์ํ๋ฒณ์ ๋ชจ์์ผ๋ก ๋ถ๋ฅํฉ๋๋ค.
๋ฌธ์์ด myString์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋ ๋ชจ์์ ์ ๊ฑฐํ ๋ฌธ์์ด์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(myString: String) = myString.replace("[a|e|i|o|u]".toRegex(), "")

fun main() {
    val myString = "nice to meet you"
    val result = "nc t mt y"

    checkAnswer(solution(myString) == result)
}