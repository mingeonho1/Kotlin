package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-07
 * **/

/** ๋ฌธ์  ์ค๋ช
๋ ๋ฐฐ์ด์ด ์ผ๋ง๋ ์ ์ฌํ์ง ํ์ธํด๋ณด๋ ค๊ณ  ํฉ๋๋ค.
๋ฌธ์์ด ๋ฐฐ์ด s1๊ณผ s2๊ฐ ์ฃผ์ด์ง ๋ ๊ฐ์ ์์์ ๊ฐ์๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(s1: Array<String>, s2: Array<String>): Int {
    var answer: Int = 0
    for (s in s1) {
        answer += s2.count { s == it }
    }
    return answer
}

//private fun solution(s1: Array<String>, s2: Array<String>) = s1.count { s2.contains(it) }

fun main() {
    val s1 = arrayOf("a", "b", "c")
    val s2 = arrayOf("com", "b", "d", "p", "c")
    val result = 2

    checkAnswer(solution(s1, s2) == result)
}