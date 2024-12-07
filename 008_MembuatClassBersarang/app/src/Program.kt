package app.src
import app.src.entitas.*

fun main(){
    println("-----------------------------")
    println("Lat. Class Bersarang : Ruella")
    println("-----------------------------")

    //membuat objek dari kelas utama
    val kelasLuar = Utama()
    //membuat objek dari class bersarang
    val kelasBersarang= Utama.bersarang()

    println( kelasLuar.menyapa() )
    println( kelasBersarang.menyapa() )
}