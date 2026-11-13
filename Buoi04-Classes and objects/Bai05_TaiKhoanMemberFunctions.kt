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

    fun napTien(soTien: Double) {
        soDu += soTien
        println("Đã nạp: $soTien")
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien <= soDu) {
            soDu -= soTien
            return true  // Rút thành công
        } else {
            return false // Không đủ số dư
        }
    }
}

fun main() {
    println("--- Khởi tạo tài khoản ---")
    val myAccount = TaiKhoanNganHang("1029384756", 100000.0)
    println("Số dư hiện tại: " + myAccount.soDu)

    println("\n--- Thực hiện nạp tiền ---")
    myAccount.napTien(50000.0)
    println("Số dư sau khi nạp: " + myAccount.soDu)

    // Lần 2: Thử rút 70.000 (đủ tiền)
    println("\n--- Thực hiện rút tiền lần 1 (70.000) ---")
    val ketQuaRut1 = myAccount.rutTien(70000.0)
    if (ketQuaRut1) {
        println("Rút tiền thành công!")
    } else {
        println("Rút tiền thất bại do không đủ số dư!")
    }
    println("Số dư sau khi rút: " + myAccount.soDu)

    // Lần 3: Thử rút 100.000 (vượt quá số dư còn lại là 80.000)
    println("\n--- Thực hiện rút tiền lần 2 (100.000) ---")
    val ketQuaRut2 = myAccount.rutTien(100000.0)
    if (ketQuaRut2) {
        println("Rút tiền thành công!")
    } else {
        println("Rút tiền thất bại do không đủ số dư!")
    }
    println("Số dư sau khi rút: " + myAccount.soDu)
}
main()