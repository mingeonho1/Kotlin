package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-13
 * **/

/** ๋ฌธ์  ์ค๋ช
๊ฐ์๋ 2 ๋ฐ์๋ 0 ๋ณด๋ 5๋ก ํํํฉ๋๋ค.
๊ฐ์ ๋ฐ์ ๋ณด๋ฅผ ๋ด๋ ์์๋๋ก ๋ํ๋ธ ๋ฌธ์์ด rsp๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
rsp์ ์ ์ฅ๋ ๊ฐ์ ๋ฐ์ ๋ณด๋ฅผ ๋ชจ๋ ์ด๊ธฐ๋ ๊ฒฝ์ฐ๋ฅผ ์์๋๋ก ๋ํ๋ธ ๋ฌธ์์ด์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(rsp: String): String {
    var answer = ""
    for (r in rsp) {
        when {
            r == '2' -> answer += "0"
            r == '0' -> answer += "5"
            else -> answer += "2"
        }
    }
    return answer
}


fun main() {
    val rsp = "205"
    val result = "052"

    checkAnswer(solution(rsp) == result)
}