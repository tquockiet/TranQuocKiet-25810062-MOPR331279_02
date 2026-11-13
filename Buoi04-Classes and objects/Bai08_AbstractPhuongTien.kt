// Họ tên: Trần Quốc Kiệt - MSSV: 25810062

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int
    fun moTa() {
        println("Phương tiện này có tốc độ tối đa là: " + tocDoToiDa + " km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 90
}
class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 180
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    println("--- Kiểm tra mô tả phương tiện ---")
    print("Xe máy: ")
    xeMay.moTa()

    print("Ô tô: ")
    oTo.moTa()
}
main()