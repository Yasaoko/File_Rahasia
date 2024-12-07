package app.src.entitas

//class dengan constructor utama
class Siswa(val nama:String, val kelas:String, val alamat:String){
    //method
    fun infoSiswa(){
        println("~ Info Siswa ~")
        println("Nama : "+nama)
        println("kelas :"+kelas)
        println("alamat :"+alamat)
    }
}