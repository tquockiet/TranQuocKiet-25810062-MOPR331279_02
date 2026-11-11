// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
// BƯỚC 1: Viết hai hàm vietHoa và daoNgược bằng fun
// ==========================================
fun vietHoa(chuoi: String): String {
    return chuoi.uppercase()
}

fun daoNguoc(chuoi: String): String {
    return chuoi.reversed()
}
// BƯỚC 2: Viết higher order function xuLyVanBan
// ==========================================
fun xuLyVanBan(chuoi: String, xuLy: (String) -> String): String {
    return xuLy(chuoi)
}

// BƯỚC 3: Gọi hàm xuLyVanBan ba lần theo ba cách khác nhau
val vanBanGoc = "laptrinhkotlin"

// Cách 1: Truyền hàm daoNguoc thông qua toán từ hai dấu hai chấm (function reference)
println("--- Cách 1 (dùng function reference) ---")
val kq1 = xuLyVanBan(vanBanGoc, ::daoNguoc)
println("Kết quả: $kq1")

// Cách 2: Truyền một lambda viết trực tiếp tại chỗ (bên trong dấu ngoặc)
println("\n--- Cách 2 (lambda viết trong ngoặc) ---")
val kq2 = xuLyVanBan(vanBanGoc, { s: String -> s.uppercase() })
println("Kết quả: $kq2")
// Cách 3: Dùng cú pháp tham số cuối (trailing lambda) để đưa lambda ra ngoài dấu ngoặc
println("\n--- Cách 3 (trailing lambda đưa ra ngoài ngoặc) ---")
val kq3 = xuLyVanBan(vanBanGoc) { s ->
    s + " - da xu ly"
}
println("Kết quả: $kq3")

