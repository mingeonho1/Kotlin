package level0

/**
 * ยฉ DEV MING ๐ป
 * Current date: 2023-03-07
 * **/

/** ๋ฌธ์  ์ค๋ช
๋ฌธ์์ด my_string์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง๋๋ค.
my_string์ ์๋ฌธ์, ๋๋ฌธ์, ์์ฐ์๋ก๋ง ๊ตฌ์ฑ๋์ด์์ต๋๋ค.
my_string์์ ์์ฐ์๋ค์ ํฉ์ returnํ๋๋ก solution ํจ์๋ฅผ ์์ฑํด์ฃผ์ธ์. **/

fun isNumeric(s: String): Boolean {
    return try {
        s.toDouble()
        true
    } catch (e: NumberFormatException) {
        false
    }
}


private fun solution(myString: String): Int {
    var answer = 0
    var str = ""
    val regex = myString.replace(("[^\\d]").toRegex(), " ").toList()
    for (re in regex) {
        if (isNumeric(re.toString())) {
            str += re.toString()
        } else if (re == ' ') {
            if (str != "") {
                answer += str.toInt()
                str = ""
            }
            continue
        }
    }
    if (str != "") {
        answer += str.toInt()
    }
    return answer
}

//private fun solution(myString: String) =
//    myString.split(("[a-z|A-Z]").toRegex()).filter(String::isNotEmpty).sumOf(String::toInt)

fun main() {
    val myString = "1a2b3c4d123Z1"
    val result = 134

    checkAnswer(solution(myString) == result)
}