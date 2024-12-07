package app.src
import app.src.entitas.Kabataku

fun main(){
    println("--------------------------------")
    println("Lat.Method Berparameter : Ruella")
    println("--------------------------------")
    val nilai1=5
    val nilai2=5
    //membuat objek dari kelas kabataku
    var kalkulator=Kabataku()

    println("$nilai1 + $nilai2 = "+ kalkulator.jumlahkan(nilai1,nilai2))
    println("$nilai1 * $nilai2 = "+ kalkulator.kalikan(nilai1,nilai2))
    println("$nilai1 / $nilai2 = "+ kalkulator.bagi(nilai1,nilai2))
    println("$nilai1 - $nilai2 = "+ kalkulator.kurangi(nilai1,nilai2))
    
}