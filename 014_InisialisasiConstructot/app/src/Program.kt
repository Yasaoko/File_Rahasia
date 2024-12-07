package app.src 
import app.src.entitas.Kucing

fun main(){
    println("---------------------------------------")
    println("Lat. Inisiaslisasi Constructor : Ruella")
    println("---------------------------------------")

    //membuat objek
    val kucing1 = Kucing("Rue", 2, "Angora")
    val kucing2 = Kucing("Beth", 1, "Persia")
    val kucing3 = Kucing("Eunha", 3, "Kampung")
    //memanggil atribut method
    print("${kucing1.nama} bersuara")
    kucing1.suara("Miaww-Miaww")

    print("${kucing2.nama} bersuara")
    kucing2.suara("Meong-Meong")

    print("${kucing3.nama} bersuara")
    kucing3.suara("Waong-Waong")
}