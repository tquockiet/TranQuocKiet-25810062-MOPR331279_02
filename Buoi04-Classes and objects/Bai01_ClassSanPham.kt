// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)
fun main() {
    // 1. Tạo object thứ nhất: truyền đủ 3 giá trị theo thứ tự
    val sp1 = SanPham("Bút bi Thiên Long", 5000.0, 50)
    // 2. Tạo object thứ hai:
    val sp2 = SanPham(
        tenSanPham = "Vở kẻ ngang",
        gia = 12000.0
    )
    println("--- Thông tin sản phẩm 1 ---")
    println("Tên: " + sp1.tenSanPham)
    println("Giá: " + sp1.gia)
    println("Số lượng tồn kho: " + sp1.soLuongTonKho)

    println("\n--- Thông tin sản phẩm 2 ---")
    println("Tên: " + sp2.tenSanPham)
    println("Giá: " + sp2.gia)
    println("Số lượng tồn kho: " + sp2.soLuongTonKho)
}
main()
