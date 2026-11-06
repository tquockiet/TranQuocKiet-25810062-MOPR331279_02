// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    val mangDiem = arrayOf(7.5, 8.0, 4.5, 9.2, 6.0, 5.5, 10.0, 3.8, 7.0, 8.5)

    var tongDiem = 0.0
    var diemCaoNhat = mangDiem[0]
    var diemThapNhat = mangDiem[0]

    for (diem in mangDiem) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tongDiem / mangDiem.size

    println("Danh sách điểm: ${mangDiem.contentToString()}")
    println("Điểm trung bình của lớp: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}