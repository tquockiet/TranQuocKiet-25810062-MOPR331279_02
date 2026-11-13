// Họ tên: Trần Quốc Kiệt - MSSV: 25810062

data class SinhVien(
    val mssv: String,
    val hoTen: String,
    val diemTrungBinh: Double
)

fun main() {
    val sv1 = SinhVien("25810062", "Trần Quốc Kiệt", 8.5)
    val sv2 = SinhVien("25810062", "Trần Quốc Kiệt", 8.5)

    println("--- 1. Kiểm tra toString() tự sinh ---")
    println(sv1)

    println("\n--- 2. Kiểm tra so sánh bằng toán tử == ---")
    val ketQuaSoSanh = (sv1 == sv2)
    println("sv1 == sv2 là: " + ketQuaSoSanh)

    val sv3 = sv1.copy(diemTrungBinh = 9.2)
    println("\n--- 3. Kiểm tra hàm copy() ---")
    println("Thông tin sv3: " + sv3)
}
main()
