package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-08
 * **/

/** ๋ฌธ์  ์ค๋ช
๋จธ์ฑ์ด๋ ์น๊ตฌ๋ค๊ณผ ๋๊ทธ๋๊ฒ ์์ ๊ณต ๋์ง๊ธฐ ๊ฒ์์ ํ๊ณ  ์์ต๋๋ค.
๊ณต์ 1๋ฒ๋ถํฐ ๋์ง๋ฉฐ ์ค๋ฅธ์ชฝ์ผ๋ก ํ ๋ช์ ๊ฑด๋๋ฐ๊ณ  ๊ทธ๋ค์ ์ฌ๋์๊ฒ๋ง ๋์ง ์ ์์ต๋๋ค.
์น๊ตฌ๋ค์ ๋ฒํธ๊ฐ ๋ค์ด์๋ ์ ์ ๋ฐฐ์ด numbers์ ์ ์ K๊ฐ ์ฃผ์ด์ง ๋,
k๋ฒ์งธ๋ก ๊ณต์ ๋์ง๋ ์ฌ๋์ ๋ฒํธ๋ ๋ฌด์์ธ์ง return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/


private fun solution(numbers: IntArray, k: Int): Int {
    var num = 0
    for (i in 1..k) {
        if (i != k) {
            num += 2
            if (num >= numbers.size) {
                num -= numbers.size
            }
        }
    }
    return numbers[num]
}


fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val k = 5
    val result = 3

    checkAnswer(solution(numbers, k) == result)
}