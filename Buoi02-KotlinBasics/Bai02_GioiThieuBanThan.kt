// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    val hoTen: String = "Trần Quốc Kiệt"
    val namSinh: Int = 2004
    val namHienTai: Int = 2026

    val tuoi = namHienTai - namSinh

    // Dùng cú pháp string template với dấu $ để chèn biến
    println("Xin chào, tôi tên là $hoTen và năm nay tôi $tuoi tuổi (sinh năm $namSinh).")
}