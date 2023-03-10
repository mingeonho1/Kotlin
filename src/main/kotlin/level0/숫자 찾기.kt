package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-24
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ num๊ณผ k๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
num์ ์ด๋ฃจ๋ ์ซ์ ์ค์ k๊ฐ ์์ผ๋ฉด num์ ๊ทธ ์ซ์๊ฐ ์๋ ์๋ฆฌ ์๋ฅผ returnํ๊ณ  ์์ผ๋ฉด -1์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(num: Int, k: Int): Int {
    for (i in 0 until num.toString().length) {
        if (num.toString()[i].code - 48 == k) {
            return i + 1
        }
    }
    return -1
}

// โ ๋๋ฒ์จฐ๋ก ์๊ฐํ ๋ต โ
//private fun solution(num: Int, k: Int) =
//    if (num.toString().indexOf(k.toString()) + 1 != 0) num.toString().indexOf(k.toString()) + 1 else -1


fun main() {
    val num = 232443
    val k = 4
    val result = 4

    checkAnswer(solution(num, k) == result)
}