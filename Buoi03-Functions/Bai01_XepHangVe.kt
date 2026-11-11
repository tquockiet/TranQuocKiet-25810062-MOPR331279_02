// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    val tuoi = 65
    val loaiVe = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi >= 12 && tuoi <= 60) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }
    println("Loại vé của bạn là: " + loaiVe)
}
main()