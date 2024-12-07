package app.src.entitas

//mengatur nama alias type yang sudah ada
typealias kartu = String
typealias pin = Int

class KartuKredit{
    //method
    fun namaKartu(card:kartu) {
        println("Nama Kartu : "+card)
    }

    fun password(card:pin) {
        println("Pin Kartu : "+card)
    }
}