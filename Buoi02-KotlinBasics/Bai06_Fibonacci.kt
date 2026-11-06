// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    println("Các số Fibonacci nhỏ hơn 100:")

    var a = 0
    var b = 1
    var index = 0

    for (i in 0..100) {
        if (a >= 100) break
        println("Vị trí (Index) $index: $a")

        val next = a + b
        a = b
        b = next
        index++
    }
}