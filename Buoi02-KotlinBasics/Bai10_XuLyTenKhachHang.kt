// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun xuLyTenKhachHang(ten: String?) {
    println("--- Xử lý tên: ${ten ?: "null"} ---")

    val doDai = ten?.length
    println("1. Dùng safe call kiểm tra độ dài: $doDai")

    val tenHienThi = ten ?: "Khách vãng lai"
    println("2. Dùng toán tử Elvis trả về tên mặc định: $tenHienThi")

    /*
     * CHÚ THÍCH TOÁN TỬ (!!):
     * Toán tử `!!` ép kiểu biến nullable thành non-null. Nếu giá trị thực tế là null,
     * chương trình sẽ gây lỗi NullPointerException (NPE) làm sập ứng dụng.
     * Chỉ dùng khi chắc chắn 100% biến không thể null.
     */
    try {
        val doDaiBatBuoc = ten!!.length
        println("3. Dùng toán tử !! (Thành công): $doDaiBatBuoc")
    } catch (e: NullPointerException) {
        println("3. Dùng toán tử !! gây lỗi NullPointerException do biến đang là null!")
    }
    println()
}

fun main() {
    xuLyTenKhachHang("Nguyễn Văn A")
    xuLyTenKhachHang(null)
}