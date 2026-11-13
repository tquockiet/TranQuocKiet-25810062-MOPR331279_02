// Họ tên: Trần Quốc Kiệt - MSSV: 25810062
interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}
class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    val hv = HinhVuong(5.0)
    val ht = HinhTron(3.0)

    println("--- Kết quả tính diện tích ---")
    println("Diện tích hình vuông (cạnh " + hv.canh + "): " + hv.tinhDienTich())
    println("Diện tích hình tròn (bán kính " + ht.banKinh + "): " + ht.tinhDienTich())
}
main()