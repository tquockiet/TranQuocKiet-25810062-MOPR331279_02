// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    val diemTrungBinh: Double = 8.8

    // Bắt buộc dùng when kết hợp range
    val xepLoai = when (diemTrungBinh) {
        in 8.5..10.0 -> "Xuất sắc"
        in 7.0..8.4 -> "Giỏi"
        in 5.5..6.9 -> "Khá"
        in 4.0..5.4 -> "Trung bình"
        in 0.0..3.9 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Xếp loại học lực: $xepLoai")
}