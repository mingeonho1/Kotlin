package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-09
 * **/

/** ๋ฌธ์  ์ค๋ช
์์ด๊ฐ ์ซ์ ๋จธ์ฑ์ด๋ ์์ด๋ก ํ๊ธฐ๋์ด์๋ ์ซ์๋ฅผ ์๋ก ๋ฐ๊พธ๋ ค๊ณ  ํฉ๋๋ค.
๋ฌธ์์ด numbers๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, numbers๋ฅผ ์ ์๋ก ๋ฐ๊ฟ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด ์ฃผ์ธ์. **/

private fun solution(numbers: String): Long {
    var answer = ""
    var str = ""
    for (num in numbers) {
        str += num
        when (str) {
            "zero" -> {
                answer += "0"
                str = ""
            }

            "one" -> {
                answer += "1"
                str = ""
            }

            "two" -> {
                answer += "2"
                str = ""
            }

            "three" -> {
                answer += "3"
                str = ""
            }

            "four" -> {
                answer += "4"
                str = ""
            }

            "five" -> {
                answer += "5"
                str = ""
            }

            "six" -> {
                answer += "6"
                str = ""
            }

            "seven" -> {
                answer += "7"
                str = ""
            }

            "eight" -> {
                answer += "8"
                str = ""
            }

            "nine" -> {
                answer += "9"
                str = ""
            }

            else -> continue
        }

    }
    return answer.toLong()
}


fun main() {
    val numbers = "onefourzerosixseven"
    val result: Long = 14067

    checkAnswer(solution(numbers) == result)
}