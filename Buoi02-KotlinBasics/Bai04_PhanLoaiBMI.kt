// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
fun main() {
    val canNang: Double = 68.0 // kg
    val chieuCao: Double = 1.70 // m

    val bmi = canNang / (chieuCao * chieuCao)

    // Dùng if else if nhiều nhánh
    val phanLoai: String = if (bmi < 18.5) {
        "Gầy"
    } else if (bmi < 25.0) {
        "Bình thường"
    } else if (bmi < 30.0) {
        "Thừa cân"
    } else {
        "Béo phì"
    }

    println("Chỉ số BMI tính được: $bmi")
    println("Phân loại: $phanLoai")
}