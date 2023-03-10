package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-02-22
 * **/

/** ๋ฌธ์  ์ค๋ช
์ ์ ๋ฐฐ์ด array๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋,
๊ฐ์ฅ ํฐ ์์ ๊ทธ ์์ ์ธ๋ฑ์ค๋ฅผ ๋ด์ ๋ฐฐ์ด์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์. **/

private fun solution(numbers: IntArray, direction: String): IntArray {
    val n = numbers.size
    val rotated = IntArray(n)
    for (i in 0 until n) {
        val newIndex = when (direction) {
            "right" -> (i + 1) % n
            "left" -> (i - 1 + n) % n
            else -> throw IllegalArgumentException("Invalid direction: $direction")
        }
        rotated[newIndex] = numbers[i]
    }
    return rotated
}


fun main() {
    val numbers = intArrayOf(4, 455, 6, 4, -1, 45, 6)
    val direction = "left"
    val result = intArrayOf(455, 6, 4, -1, 45, 6, 4)

    checkAnswer(solution(numbers, direction).contentEquals(result))
}