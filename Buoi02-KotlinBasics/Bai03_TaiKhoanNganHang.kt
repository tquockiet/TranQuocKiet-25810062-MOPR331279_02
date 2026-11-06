// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    // val được dùng cho số dư ban đầu vì giá trị này là cố định, không thay đổi để đối chiếu
    val soDuBanDau: Double = 5000000.0

    // var được dùng cho số dư hiện tại vì giá trị này thay đổi qua từng giao dịch
    var soDuHienTai: Double = soDuBanDau

    println("Số dư ban đầu: $soDuBanDau VNĐ")

    soDuHienTai += 2000000.0
    println("Sau khi gửi 2,000,000 VNĐ, số dư hiện tại là: $soDuHienTai VNĐ")

    soDuHienTai -= 1500000.0
    println("Sau khi rút 1,500,000 VNĐ, số dư hiện tại là: $soDuHienTai VNĐ")

    println("Đối chiếu lại với số dư ban đầu cố định ($soDuBanDau VNĐ).")
}