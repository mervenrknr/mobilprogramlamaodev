class yeni {
    //soru 1
    fun main() {
        var toplamekleme = 0
        var carpim = 1
        var ciftsayilarintoplami= 0

        for (i in 1..350 step 2) {
            toplamekleme += i
            carpim *= i
        }

        for (i in 2..350 step 2) {
            ciftsayilarintoplami += i * i
        }

        println("Tek sayıların toplamı: $toplamekleme")
        println("Tek sayıların çarpımı: $carpim")
        println("Çift sayıların karelerinin toplamı: $ciftsayilarintoplami")
    }
//
}