package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-14
 * **/

/** ๋ฌธ์  ์ค๋ช
๊ตฐ ์ ๋ต๊ฐ ๋จธ์ฑ์ด๋ ์ ์ ์ค ์ ๊ตฐ์ด ๋ค์๊ณผ ๊ฐ์ ์ํธ ์ฒด๊ณ๋ฅผ ์ฌ์ฉํ๋ค๋ ๊ฒ์ ์์๋์ต๋๋ค.
- ์ํธํ๋ ๋ฌธ์์ด cipher๋ฅผ ์ฃผ๊ณ ๋ฐ์ต๋๋ค.
- ๊ทธ ๋ฌธ์์ด์์ code์ ๋ฐฐ์ ๋ฒ์งธ ๊ธ์๋ง ์ง์ง ์ํธ์๋๋ค.
๋ฌธ์์ด cipher์ ์ ์ code๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋ ํด๋๋ ์ํธ ๋ฌธ์์ด์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์ **/

private fun solution(cipher: String, code: Int): String {
    var answer = ""
    for (i in code..cipher.length step (code)) {
        answer += cipher[i - 1]
    }
    return answer
}


fun main() {
    val cipher = "dfjardstddetckdaccccdegk"
    val code = 4
    val result = "attack"

    checkAnswer(solution(cipher, code) == result)
}