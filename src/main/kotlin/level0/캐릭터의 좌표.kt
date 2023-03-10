package level0

import kotlin.math.abs

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-13
 * **/

/** ๋ฌธ์  ์ค๋ช
๋จธ์ฑ์ด๋ RPG๊ฒ์์ ํ๊ณ  ์์ต๋๋ค.
๊ฒ์์๋ up, down, left, right ๋ฐฉํฅํค๊ฐ ์์ผ๋ฉฐ ๊ฐ ํค๋ฅผ ๋๋ฅด๋ฉด ์, ์๋, ์ผ์ชฝ, ์ค๋ฅธ์ชฝ์ผ๋ก ํ ์นธ์ฉ ์ด๋ํฉ๋๋ค.
์๋ฅผ ๋ค์ด [0,0]์์ up์ ๋๋ฅธ๋ค๋ฉด ์บ๋ฆญํฐ์ ์ขํ๋ [0, 1], down์ ๋๋ฅธ๋ค๋ฉด [0, -1], left๋ฅผ ๋๋ฅธ๋ค๋ฉด [-1, 0], right๋ฅผ ๋๋ฅธ๋ค๋ฉด [1, 0]์๋๋ค.
๋จธ์ฑ์ด๊ฐ ์๋ ฅํ ๋ฐฉํฅํค์ ๋ฐฐ์ด keyinput์ ๋งต์ ํฌ๊ธฐ board์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง๋๋ค.
์บ๋ฆญํฐ๋ ํญ์ [0,0]์์ ์์ํ  ๋ ํค ์๋ ฅ์ด ๋ชจ๋ ๋๋ ๋ค์ ์บ๋ฆญํฐ์ ์ขํ [x, y]๋ฅผ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์.

[0, 0]์ board์ ์  ์ค์์ ์์นํฉ๋๋ค.
์๋ฅผ ๋ค์ด board์ ๊ฐ๋ก ํฌ๊ธฐ๊ฐ 9๋ผ๋ฉด ์บ๋ฆญํฐ๋ ์ผ์ชฝ์ผ๋ก ์ต๋ [-4, 0]๊น์ง ์ค๋ฅธ์ชฝ์ผ๋ก ์ต๋ [4, 0]๊น์ง ์ด๋ํ  ์ ์์ต๋๋ค. **/

private fun solution(keyinput: Array<String>, board: IntArray): IntArray {
    var x = 0
    var y = 0

    for (key in keyinput) {
        when (key) {
            "up" -> y++
            "down" -> y--
            "left" -> x--
            "right" -> x++
        }
        if (board[0] / 2 <= x) {
            x = board[0] / 2
        }

        if (board[1] / 2 <= y) {
            y = board[1] / 2
        }

        if (x < 0 && board[0] / 2 <= abs(x)) {
            x = -(board[0] / 2)

        }
        if (y < 0 && board[1] / 2 <= abs(y)) {
            y = -(board[1] / 2)
        }
    }

    return intArrayOf(x, y)
}

fun main() {
    val keyinput = arrayOf("left", "right", "up", "right", "right")
    val board = intArrayOf(11, 11)
    val result = intArrayOf(2, 1)

    checkAnswer(solution(keyinput, board).contentEquals(result))
}
