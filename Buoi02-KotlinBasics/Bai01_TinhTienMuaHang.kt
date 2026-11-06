// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    val soLuong: Int = 5
    val donGia: Double = 125000.0

    // Bắt buộc ép kiểu số lượng sang Double trước khi nhân với đơn giá
    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VND")
    println("Tiền hàng: $tienHang VND")
    println("Thuế (8%): $thue VND")
    println("Tổng tiền cuối cùng phải trả: $tongTien VND")
}