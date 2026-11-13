// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Động vật đang phát ra tiếng kêu..."
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu!"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo!"
    }
}

fun main() {
    val danhSachDongVat: List<DongVat> = listOf(
        Cho("Chó cỏ "),
        Meo("Mèo đen"),
    )
    println("--- Danh sách tiếng kêu của các con vật ---")
    for (dv in danhSachDongVat) {
        println(dv.ten + " kêu: " + dv.keu())
    }
}
main()