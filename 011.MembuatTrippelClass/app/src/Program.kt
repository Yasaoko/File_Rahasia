package app.src

fun main(){
    println("--------------------------------------")
    println("Lat.Menggunakan Trippel Class : Ruella")
    println("--------------------------------------")

    //declare triple
    var triple = Triple("Ruella", "Perempuan", "Kyoto")

    println("Nama : "+ triple.first)
    println("jenis Kelamin :"+ triple.second)
    println("Alamat :"+ triple.third)

    println("-------------")

    //declare triple
    val (x, y, z) = Triple(1, "Beth", "Tokyo")

    println("No : "+x)
    println("Nama : "+y)
    println("Alamat : "+z)
} 