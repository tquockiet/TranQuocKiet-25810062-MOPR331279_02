// Họ tên: Trần Quốc Kiệt - MSSV: 25810062

// HÀM 1: TÍNH BÌNH PHƯƠNG MỘT SỐ
// Phiên bản đầy đủ (có return)
fun tinhBinhPhuong(x: Int): Int {
    return x * x
}
// Phiên bản rút gọn một dòng (Single Expression Function)
fun tinhBinhPhuongRutGon(x: Int): Int = x * x

// HÀM 2: TÍNH CHU VI HÌNH VUÔNG (cạnh * 4)

// Phiên bản đầy đủ (có return)
fun tinhChuViHinhVuong(canh: Double): Double {
    return canh * 4
}
// Phiên bản rút gọn một dòng
fun tinhChuViHinhVuongRutGon(canh: Double): Double = canh * 4

// HÀM 3: KIỂM TRA SỐ CHẴN (trả về Boolean)

// Phiên bản đầy đủ (có return)
fun laSoChan(n: Int): Boolean {
    return n % 2 == 0
}

// Phiên bản rút gọn một dòng
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0

fun main() {
    println("--- Test Ham 1: Binh phuong ---")
    println("Ban day du: " + tinhBinhPhuong(5))
    println("Ban rut gon: " + tinhBinhPhuongRutGon(5))

    println("\n--- Test Ham 2: Chu vi hinh vuong ---")
    println("Ban day du: " + tinhChuViHinhVuong(4.0))
    println("Ban rut gon: " + tinhChuViHinhVuongRutGon(4.0))

    println("\n--- Test Ham 3: Kiem tra so chan ---")
    println("Ban day du (so 6): " + laSoChan(6))
    println("Ban rut gon (so 6): " + laSoChanRutGon(6))
}
main()