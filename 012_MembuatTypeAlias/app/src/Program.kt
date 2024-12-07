package app.src.entitas
import app.src.entitas.KartuKredit

//Mengatur nama alias dari type Class kartu kredit
typealias KartuAtm = KartuKredit

fun main(){
    println("--------------------------------")
    println("Lat. Membuat Type Alias : Ruella")
    println("--------------------------------")

    //membuat objek dari class KartuKredit
    var kartu = KartuAtm()

    //memanggil method 
    kartu.namaKartu("BCA")
    kartu.password(112345)
}