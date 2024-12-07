package app.src
import app.src.entitas.*

fun main(){
    println("----------------------------------")
    println("Lat. Membuat Constructor : Ruella ")
    println("----------------------------------")

    //membuat objek 
    val guru1 = Guru ("Ruella", "B jepang", "Ruella@gmail.com")
    val guru2 = Guru ("Beth", "Sejarah", "Beth@gmail.com")
    val guru3 = Guru ("Eunha", "Pkn", "Eunha@gmail.com")

    val siswa1 = Siswa("Rue", "XI RPL ", "Kyoto")
    val siswa2 = Siswa("Kuru", "XI RPL ", "Tokyo")
    val siswa3 = Siswa("Hinata", "XI RPL ", "Akihabara")

    //memanggil method 
    guru1.infoGuru()
    guru2.infoGuru()
    guru3.infoGuru()

    siswa1.infoSiswa()
    siswa2.infoSiswa()
    siswa3.infoSiswa()
}