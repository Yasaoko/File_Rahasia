package app.src

import app.src.entitas.Guru

fun main(){
    println("------------------------------------------")
    println("Lat. Memanggil Method dan Atribut : Ruella")
    println("------------------------------------------")
    //ini adalah instansisa objek dari class Guru
    //atau pembuatan objek
    var objek_guru =  Guru()

    //memanggil method
    objek_guru.perkenalan()
    objek_guru.quots("Jangan Biarkan Orang Lain Mengatur Hidupmu Bahkan Orang Tua Mu Tidak Bisa Mengaturnya")

    //memanggil atribut
    println("\nNama : "+ objek_guru.nama)
    println("Mapel : "+ objek_guru.mapel)
    println("Alamat : "+ objek_guru.alamat)
}