// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    val danhSachSach = mutableListOf("Nhà Giả Kim", "Đắc Nhân Tâm", "Tuổi Trẻ Đáng Giá Bao Nhiêu", "Sapiens", "Hạt Giống Tâm Hồn")

    println("Danh sách sách ban đầu:")
    println(danhSachSach)

    danhSachSach.add("Đời Ngắn Đừng Ngủ Dài")
    danhSachSach.add("Nhà Lãnh Đạo Không Chức Danh")
    danhSachSach.remove("Hạt Giống Tâm Hồn")
    danhSachSach.sort()

    println("\nDanh sách sách sau khi thêm, xóa và sắp xếp:")
    println(danhSachSach)
}