package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-03
 * **/

/** ๋ฌธ์  ์ค๋ช
1๋ถํฐ 13๊น์ง์ ์์์, 1์ 1, 10, 11, 12, 13 ์ด๋ ๊ฒ ์ด 6๋ฒ ๋ฑ์ฅํฉ๋๋ค.
์ ์ i, j, k๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, i๋ถํฐ j๊น์ง k๊ฐ ๋ช ๋ฒ ๋ฑ์ฅํ๋์ง return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(i: Int, j: Int, k: Int): Int {
    var answer = 0
    for (n in i..j) {
        answer += n.toString().count { it.toString() == k.toString() }
    }
    return answer
}


fun main() {
    val i = 10
    val j = 50
    val k = 5
    val result = 5

    checkAnswer(solution(i, j, k) == result)
}