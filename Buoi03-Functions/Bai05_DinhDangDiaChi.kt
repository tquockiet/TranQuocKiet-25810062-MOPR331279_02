// Họ tên: Trần Quốc Kiệt - MSSV: 25810062

fun dinhDangDiaChi(
    tenNguoiNhan: String,
    soDienThoai: String,
    soNhaTenDuong: String = "123 Le Loi",
    phuongXa: String = "Ben Nghe",
    quanHuyen: String = "Quan 1"
) {
    println("Nguoi nhan: $tenNguoiNhan - SDT: $soDienThoai")
    println("Dia chi: $soNhaTenDuong, $phuongXa, $quanHuyen\n")
}


println("--- Test goi ham 1 ---")
dinhDangDiaChi(
    "Nguyen Van A",
    "0901234567",
    soNhaTenDuong = "45 Nguyen Hue",
    phuongXa = "Ben Nghe",
    quanHuyen = "Quan 1"
)

println("--- Test goi ham 2 ---")
dinhDangDiaChi(
    "Tran Thi B",
    "0988765432",
    soNhaTenDuong = "88 Cach Mang Thang 8",
    phuongXa = "Phuong 6",
    quanHuyen = "Quan 3"
)