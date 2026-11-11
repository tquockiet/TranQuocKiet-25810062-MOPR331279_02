// Họ tên: Trần Quốc Kiệt - MSSV: 25810062

fun datBan(tenKhach: String, soKhach: Int, loaiBan: String = "bàn thường") {
    println("Khách: $tenKhach - Số lượng: $soKhach khách - Loại: $loaiBan")
}

println("Cách 1 (dùng mặc định):")
datBan("Nguyen Van A", 3)

// Gọi kiểu 2: Truyền đủ tham số theo đúng thứ tự
println("\nCách 2 (truyền đủ thứ tự):")
datBan("Tran Thi B", 5, "bàn VIP")

// Gọi kiểu 3: Truyền bằng tên tham số (Named Arguments)
println("\nCách 3 (dùng tên tham số):")
datBan(soKhach = 2, tenKhach = "Le Van C", loaiBan = "bàn ngoài trời")