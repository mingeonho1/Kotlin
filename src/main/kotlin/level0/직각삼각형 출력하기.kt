package level0

/**
 * © DEV MING 💻
 * Current date: 2023-02-15
 * **/

/** 문제 설명
"*"의 높이와 너비를 1이라고 했을 때,
"*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요. **/

fun main(args: Array<String>) {
//    val (n) = readln().split(' ').map(String::toInt)
//    n = 3
    for (i in 1..3) {
        println("*".repeat(i))
    }
}