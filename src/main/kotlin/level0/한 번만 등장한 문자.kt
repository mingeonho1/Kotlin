package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-06
 * **/

/** ๋ฌธ์  ์ค๋ช
๋ฌธ์์ด s๊ฐ ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง๋๋ค.
s์์ ํ ๋ฒ๋ง ๋ฑ์ฅํ๋ ๋ฌธ์๋ฅผ ์ฌ์  ์์ผ๋ก ์ ๋ ฌํ ๋ฌธ์์ด์ return ํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด๋ณด์ธ์.
ํ ๋ฒ๋ง ๋ฑ์ฅํ๋ ๋ฌธ์๊ฐ ์์ ๊ฒฝ์ฐ ๋น ๋ฌธ์์ด์ return ํฉ๋๋ค. **/

private fun solution(s: String): String {
    var answer = ""
    var hashMap = HashMap<String, Int>()
    val strSet: MutableSet<String> = mutableSetOf()
    for (str in s) {
        hashMap[str.toString()] = 0
        strSet.add(str.toString())
    }
    for (str in s) {
        hashMap.replace(str.toString(), hashMap[str.toString()]?.plus(1) ?: 0)
    }
    for (str in strSet) {
        if (hashMap[str] == 1) {
            answer += str
        }
    }
    return answer.split("").sorted().joinToString("")
}

fun main() {
    val s = "abdc"
    val result = "abcd"
    checkAnswer(solution(s) == result)
}