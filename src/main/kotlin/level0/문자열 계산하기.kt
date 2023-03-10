package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-09
 * **/

/** ๋ฌธ์  ์ค๋ช
my_string์ "3 + 5"์ฒ๋ผ ๋ฌธ์์ด๋ก ๋ ์์์๋๋ค.
๋ฌธ์์ด my_string์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, ์์์ ๊ณ์ฐํ ๊ฐ์ return ํ๋ solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

private fun solution(myString: String): Int {
    var answer = 0
    val strList = myString.split(" ")
    for (i in strList.indices) {
        if (i == 0) {
            answer = strList[i].toInt()
        } else if (strList[i] == "+") {
            answer += strList[i + 1].toInt()
        } else if (strList[i] == "-") {
            answer -= strList[i + 1].toInt()
        }
        continue
    }
    return answer
}


fun main() {
    val myString = "3 + 4 - 50 + 50"
    val result = 7

    checkAnswer(solution(myString) == result)
}