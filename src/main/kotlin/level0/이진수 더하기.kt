package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-07
 * **/

/** ๋ฌธ์  ์ค๋ช
์ด์ง์๋ฅผ ์๋ฏธํ๋ ๋ ๊ฐ์ ๋ฌธ์์ด bin1๊ณผ bin2๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
๋ ์ด์ง์์ ํฉ์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(bin1: String, bin2: String) =
    Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2))


fun main() {
    val bin1 = "1001"
    val bin2 = "1111"
    val result = "11000"
    
    checkAnswer(solution(bin1, bin2) == result)
}