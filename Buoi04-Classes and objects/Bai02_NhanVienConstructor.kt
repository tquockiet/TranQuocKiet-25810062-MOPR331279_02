// Họ tên: Trần Quốc Kiệt - MSSV: 25810062

class NhanVien(
    maNhanVien: String,
    val ten: String,
    var luongThang: Double
) {

    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV001", "Nguyễn Văn Nam", 12000.0)

    val nv2 = NhanVien("Trần Thị Hoa")

    // 3. In thông tin tên và lương tháng của cả hai
    println("--- Thông tin Nhân viên 1 (Dùng constructor chính) ---")
    println("Tên: " + nv1.ten)
    println("Lương tháng: " + nv1.luongThang)

    println("\n--- Thông tin Nhân viên 2 (Dùng constructor phụ) ---")
    println("Tên: " + nv2.ten)
    println("Lương tháng: " + nv2.luongThang)

}
main()