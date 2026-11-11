// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}
// Bộ số liệu thứ nhất
val dai1 = 5.0
val rong1 = 3.5
val dienTich1 = tinhDienTich(dai1, rong1)
println("Diện tích hình chữ nhật 1 (dài = $dai1, rộng = $rong1) là: $dienTich1")

// Bộ số liệu thứ hai
val dai2 = 10.2
val rong2 = 4.0
val dienTich2 = tinhDienTich(dai2, rong2)
println("Diện tích hình chữ nhật 2 (dài = $dai2, rộng = $rong2) là: $dienTich2")