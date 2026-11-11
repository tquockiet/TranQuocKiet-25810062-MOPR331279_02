// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
// Tạo danh sách tên nhạc cụ ban đầu
val danhSachNhacCu = listOf("guitar", "piano", "violin", "guitar bass", "drum", "gong")

// Chọn chữ cái để lọc (ví dụ lọc các nhạc cụ bắt đầu bằng chữ 'g')
val chuCaiDau = 'g'

// 1. BẢN LỌC THÔNG THƯỜNG (Eager Evaluation)
val ketQuaEager = danhSachNhacCu.filter { it.startsWith(chuCaiDau) }
println("--- Cách 1: Lọc thông thường (Eager) ---")
println(ketQuaEager)

// 2. BẢN LỌC QUA SEQUENCE (Lazy Evaluation)
val ketQuaLazy = danhSachNhacCu.asSequence()
    .filter { it.startsWith(chuCaiDau) }
    .toList()

println("\n--- Cách 2: Lọc qua Sequence (Lazy) ---")
println(ketQuaLazy)

