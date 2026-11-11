// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
// PHẦN 1: Dùng map để nhân đôi từng phần tử trong danh sách số nguyên
val danhSachGoc = listOf(1, 2, 3, 4, 5)

// Dùng map để nhân đôi (nhân với 2)
val danhSachNhanDoi = danhSachGoc.map { it * 2 }

println("--- Phần 1: Dùng map nhân đôi danh sách ---")
println("Danh sách gốc: $danhSachGoc")
println("Sau khi nhân đôi: $danhSachNhanDoi")
// PHẦN 2: Tạo danh sách chứa nhiều danh sách con, dùng flatten để gộp thành danh sách phẳng duy nhất
val danhSachLongNhau = listOf(
    listOf(1, 2),
    listOf(3, 4, 5),
    listOf(6, 7)
)

// Dùng flatten để gộp tất cả thành một danh sách phẳng
val danhSachPhang = danhSachLongNhau.flatten()

println("\n--- Phần 2: Dùng flatten gộp danh sách lồng nhau ---")
println("Danh sách lồng nhau: $danhSachLongNhau")
println("Sau khi flatten: $danhSachPhang")
