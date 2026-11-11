// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
// 1. PHIÊN BẢN HÀM THƯỜNG (dùng fun)

fun kiemTraDoDai(matKhau: String): Boolean {
    return matKhau.length >= 8
}

// 2. PHIÊN BẢN LAMBDA
// Có khai báo kiểu function type tường minh: (String) -> Boolean
// ==========================================
val kiemTraDoDaiLambda: (String) -> Boolean = { matKhau ->
    matKhau.length >= 8
}

// 3. GỌI VÀ IN KẾT QUẢ VỚI 3 CHUỖI MẬT KHẨU KHÁC NHAU
val mk1 = "123"          // Ngắn hơn 8 ký tự
val mk2 = "abcdefgh"     // Đủ 8 ký tự
val mk3 = "matkhauhieu"  // Dài hơn 8 ký tự

println("--- Kiem tra voi mat khau: '$mk1' ---")
println("Dung fun: " + kiemTraDoDai(mk1))
println("Dung lambda: " + kiemTraDoDaiLambda(mk1))

println("\n--- Kiem tra voi mat khau: '$mk2' ---")
println("Dung fun: " + kiemTraDoDai(mk2))
println("Dung lambda: " + kiemTraDoDaiLambda(mk2))

println("\n--- Kiem tra voi mat khau: '$mk3' ---")
println("Dung fun: " + kiemTraDoDai(mk3))
println("Dung lambda: " + kiemTraDoDaiLambda(mk3))