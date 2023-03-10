package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-13
 * **/

/** ๋ฌธ์  ์ค๋ช
๋ฌธ์์ด myString์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
๋๋ฌธ์๋ ์๋ฌธ์๋ก ์๋ฌธ์๋ ๋๋ฌธ์๋ก ๋ณํํ ๋ฌธ์์ด์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(myString: String): String {
    var answer = ""
    for (s in myString) {
        answer += if (s.isUpperCase()) {
            s.lowercaseChar()
        } else {
            s.uppercaseChar()
        }
    }
    return answer
}


fun main() {
    val myString = "abCdEfghIJ"
    val result = "ABcDeFGHij"

    checkAnswer(solution(myString) == result)
}