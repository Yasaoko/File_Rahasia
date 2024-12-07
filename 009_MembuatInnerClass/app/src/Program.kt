package app.src
import app.src.entitas.*

fun main(){
    println("---------------------------------------------")
    println("Lat. inner class(class didalam class): Ruella")
    println("---------------------------------------------")

    //membuat objek dari kelas utama
    val kelasLuar = Utama()
    //membuat objek dari class inner
    val kelasDalam= Utama().Dalam()

    println( kelasLuar.menyapa() )
    println( kelasDalam.menyapa() )
}