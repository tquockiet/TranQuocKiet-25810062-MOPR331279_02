// Họ tên: Trần Quốc Kiệt - MSSV: 25810062

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau
    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan thanh cong kem so du ban dau: $soDuBanDau")
        }
    }
}

fun main() {
    // 1. Tạo object với số dư ban đầu hợp lệ (lớn hơn hoặc bằng 0)
    println("--- Khởi tạo tài khoản 1 (Hợp lệ) ---")
    val tk1 = TaiKhoanNganHang("1029384756", 500000.0)

    // 2. Tạo object với số dư ban đầu âm (< 0)
    println("\n--- Khởi tạo tài khoản 2 (Số dư âm) ---")
    val tk2 = TaiKhoanNganHang("9876543210", -100000.0)
}
main()